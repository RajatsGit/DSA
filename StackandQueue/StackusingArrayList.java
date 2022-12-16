package StackandQueue;

import java.util.ArrayList;

public class StackusingArrayList {
    ArrayList<Integer> list = new ArrayList<>();
    int front;
    int rear;
    int size;
    StackusingArrayList(){
        this.rear = -1;
        this.front = -1;
        this.size = 0;
    }
    public boolean isEmpty(){
        if(rear == -1){
            return true;
        }
        return false;
    }
    public void push(int value){
     if(rear == -1 && front == -1){
        rear++;
        front++;
        list.add(value);
        size++;
        return;
     }
        rear ++;
        list.add(value);
    }
    public int pop(){
     if(rear == -1){
        System.out.println("Stack is Empty");
        return Integer.MIN_VALUE;
     }
     if(rear == front){
        int popped = list.get(rear);
        rear = -1;
        front =-1;
        return popped;
     }
     int popped = list.get(rear);
     rear--;
     return popped;
    }
    
    public int peek(){
        if(rear == -1){
           System.out.println("Stack is Empty");
           return Integer.MIN_VALUE;
        }
        if(rear == front){
           int popped = list.get(rear);
           size--;
           return popped;

        }
        int popped = list.get(rear);
        size--;
        return popped;
       }
       public void reverse(){
        if(rear == -1){
            System.out.println("Stack is Empty");
            return;
        }
        int i = front,j=rear;
        while(i<=j){
         int temp1 = list.get(i);
         int temp2 = list.get(j);
         list.set(i,temp2);
         list.set(j,temp1);
         i++;
         j--;
        }
       }
       public void display(){
        if(rear == -1){
            System.out.println("Stack is Empty");
            return;
        }
        for(int i = rear; i>= front;i--){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("END");
       }
       public void removeMiddle(){
        list.remove((rear-front)/2);
        for(int i =((rear-front)/2)+1;i<rear;i++){
           int temp = list.get(i+1);
            list.set(i,temp);
        }
        rear--;
       }

}
