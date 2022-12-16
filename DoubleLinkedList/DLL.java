package DoubleLinkedList;
import java.io.*;
import java.util.*;
public class DLL {
        public DLL() {
            this.size=0;
    }
        Node head;
        Node tail;
        int size;
    public void addFirst(int value){
        Node n = new Node(value);
        n.next = head;
        n.prev = null;
        if(head!=null){
        head.prev = n;}
        head =n;
        this.size++;
       }
    //    public Node getNode(int index){
        
    //    }
       public void addLast(int value){
        Node n = new Node(value);
        Node last = head;
        n.next=null;
        if(head == null){
            n.prev = null;
            head = n;
            return;
        } 
        while(last.next!=null){
            last = last.next;
        } 
        last.next = n;
        n.prev = last;
       } 
       public void display(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            System.out.print(temp.val+" ");
             last = temp;
            temp= temp.next;
        }
        System.out.println();
        while(last!=null){
            System.out.print(last.val+" ");
            last = last.prev;
        }
        System.out.println();
       }
       public Node getNode(int index){
        Node temp = head;
        int count =0;
        while(temp!=null && count<index){
            temp = temp.next;
        }
        return temp;
       }
       public void addIndex(int index,int value){
        if(size == 0){
            addFirst(value);
            return;
        }
        // if(index == size-1){
        //     addLast(value);
        //     return;
        // }
        Node n = new Node(value);
        Node x = getNode(index);
        // Node y = getNode(index+1);
        n.next = x.next;
        x.next = n;
        n.next.prev = n;
        n.prev = x;
       }

       private class Node{
        private int val;
        private Node next;
        private Node prev;
        
         Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }

     Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }}
    }
