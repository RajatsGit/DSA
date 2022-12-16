package StackandQueue;

import java.util.Stack;

public class ImplementQueueusing2stacksEnqueEfficient {
    Stack<Integer>main;
    Stack<Integer>helper;
    ImplementQueueusing2stacksEnqueEfficient(){
        main = new Stack<>();
        helper = new Stack<>();
    }
    public void enqueue(int value){
        main.push(value);
        return;
    }
    public boolean isEmpty(){
        return main.isEmpty();
    }
    public int dequeue(){
        if(main.isEmpty()){
            return -1;
        }
        while(main.size()!=1){
            helper.push(main.pop());
        }
        int valueToremove = main.pop();
        while(helper.isEmpty() == false){
            main.push(helper.pop());
        }
        return valueToremove;
    }
    public int peek(){
        if(main.isEmpty()){
            return -1;
        }
        while(main.size()!=1){
            helper.push(main.pop());
        }
        int valueToremove = main.peek();
        while(helper.isEmpty() == false){
            main.push(helper.pop());
        }
        return valueToremove;
    }
    public int size(){
        return main.size();
    }

    
    
}
