package StackandQueue;

import java.util.Stack;

public class ImplementQueueusing2StacksDequeEfficient {
    Stack<Integer>main;
    Stack<Integer>helper;
    ImplementQueueusing2StacksDequeEfficient(){
        main = new Stack<>();
        helper = new Stack<>();
    }
    public void enqueue(int value){
        while(main.isEmpty()==false){
            helper.push(main.pop());
        }
        main.push(value);
        while(helper.isEmpty()==false){
            main.push(helper.pop());
        }
    }
    public int dequeue(){
        return main.pop();
    }
    public int peek(){
        return main.peek();
    }
    public boolean isEmpty(){
        return main.isEmpty();
    }
    public int size(){
        return main.size();
    }
}
