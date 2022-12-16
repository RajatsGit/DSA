package StackandQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusing2QueuespushEfficient {
    Queue<Integer> main;
    Queue<Integer> helper;
    ImplementStackusing2QueuespushEfficient(){
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }

    public void push(int value){
        main.add(value);
        return;
    }
    public int pop(){
        while(main.size()!=1){
            helper.add(main.remove());
        }
        int valueToremove = main.remove();
        while(helper.isEmpty()==false){
            main.add(helper.remove());
        }
        return valueToremove;
    }
    public int peek(){
        while(main.size()!=1){
            helper.add(main.remove());
        }
        int valueToremove = main.peek();
        while(helper.isEmpty()==false){
            main.add(helper.remove());
        }
        return valueToremove;
    }
    public boolean isEmpty(){
        return main.isEmpty();
    }
    public int size(){
        return main.size();
    }
}
