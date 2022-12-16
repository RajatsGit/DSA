package Main;

import java.util.LinkedList;
import java.util.Queue;

public class InterLeaveStack {
    public static void interleave(Queue<Integer>q){
        Queue<Integer> firsthalf = new LinkedList<>();
        Queue<Integer> secondhalf = new LinkedList<>();
        int x = q.size();
        int i=0;
        while(i<x/2){
          firsthalf.add(q.remove());
          i++;
        }
        // System.out.println(i);
        while(q.isEmpty()==false){
            secondhalf.add(q.remove());
        }
        while(firsthalf.isEmpty()==false){
            q.add(firsthalf.remove());
            q.add(secondhalf.remove());
        }
        while(q.isEmpty()==false){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<10;i++){
            q.add(i+11);
        }
       interleave(q);
    }
}
