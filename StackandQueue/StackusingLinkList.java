package StackandQueue;

public class StackusingLinkList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    int size;
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
    public void push(int value){
        Node newNode = new Node(value);
        if(head == null){
         head = newNode;
          size++;
         return;
        }
        newNode.next = head;
        head = newNode;
        size++;
        return;
    }
    public int pop(){
        if(head == null){
            System.out.println("Stack is Underflow");
            return Integer.MIN_VALUE;
        }
        int popped = head.data;
        head = head.next;
        size--;
        return popped;
    }
    public int peek(){
        if(head == null){
            System.out.println("Stack is Underflow");
            return Integer.MIN_VALUE;
        }
        int popped = head.data;
        return popped;
    }
   public void display(){
    Node temp = head;
    while(temp!=null){
       System.out.print(temp.data+" -> ");
       temp = temp.next;
    }
    System.out.println("END");
   }
   public void reverseStack(){
    Node curr = head;
    Node prev = null;
    while(curr!=null){
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;
    return;
   }
   public int removeMiddle(){
    Node temp = head;
    int count=1;
    while(temp!=null && count < (this.size/2)){
        temp = temp.next;
        count++;
    }
    int middle = temp.next.data;
    temp.next = temp.next.next;
    return middle;
}
}
