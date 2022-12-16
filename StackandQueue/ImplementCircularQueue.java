package StackandQueue;

import java.util.ArrayList;

public class ImplementCircularQueue {
    int size;
    int rear;
    int front;
    ArrayList<Integer> list = new ArrayList<>();
    ImplementCircularQueue(int size){
        this.size = size;
        this.front =-1;
        this.rear = -1;
    } 
    public void enQueue(int value){
        if(front == -1 ){      // circular Queue is Empty.
            front = 0;
            rear = 0;
            list.add(front,value);
            return;
        }
        if(((rear == size-1) && (front == 0)) || (rear == front-1))     // Circular Queue is full.
         {
            System.out.println("Queue is full");
             return;
         }
         if(rear >= front){
            rear++;
            list.add(rear,value);
            return;
         }
         if(rear < front){
            rear++;
            list.set(rear,value);
            return;
         }
    }
    public int deQueue(){
        int temp;
        if(front == -1){
            System.out.println("Queue is Empty");
            return -1;
        }
        if(front == rear && front == size-1){      // one element in Circular Queue.
            temp = list.get(front);
            front = -1;
            rear = -1;
            return temp;          
         }
        if(front == size-1){      // front is last element in Circular Queue.
            temp = list.get(front);
            front = 0;
            return temp;
        }
        
        temp = list.get(front);
        front++;
        return temp;
    }
    public void display(){
        if(front == -1 && rear == -1){
           System.out.println("Queue is empty");
           return;
        }
        if(rear >= front){
            for(int i=front ;i<=rear;i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
            return;
        }
    if(rear < front){
        for(int i=front ;i<size;i++){
            System.out.print(list.get(i)+" ");
        }
        for(int i=0 ;i<=rear;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}}
