package StackandQueue;

public class QueueusingLinkelist {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    int size;
    QueueusingLinkelist(){
        this.size = 0;
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
    public void enque(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
        return;
    }
    public int deque(){
        if(head == null){
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        int popped = head.data;
        head = head.next;
        size--;
        return popped;
    }
    public int peek(){
        if(head == null){
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        int popped = head.data;
        return popped;
    }
    public void reverse(){
        if(head == null){
            System.out.println("Stack is Empty");
            return;
        }
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        tail = head;
        head = prev;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" <-");
            temp = temp.next;
        }
        System.out.println("END");
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
