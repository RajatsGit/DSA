package StackandQueue;
import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusing2QueuespopEfficient {
    Queue<Integer> main;
    Queue<Integer> helper;
    ImplementStackusing2QueuespopEfficient(){
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }
    public void enqueue(int value){
        while(main.size()!=0){
            helper.add(main.remove());
        }
         main.add(value);
        while(helper.isEmpty()==false){
            main.add(helper.remove());
        }
        return;
    }
    public int dequeue(){
        return main.remove();
    }
    public int peek(){
        return main.peek();
    }
    public int size(){
        return main.size();
    }
    public boolean isEmpty(){
        return main.isEmpty();
    }
}
