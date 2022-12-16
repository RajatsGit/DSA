package Main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxOfKSizedWindow {
    public static void maxOfKSizedWindow(int []a, int k){
        Deque<Integer> dq = new LinkedList<>();
        int start=0,end=0;
       while(end<a.length){
        while(!dq.isEmpty() && dq.peekLast() < a[end]){
            dq.removeLast();
        }
        dq.addLast(a[end]);
        if(end-start+1 < k){
          end++;
        }
        else{
            System.out.print(dq.peekFirst()+" ");

                if(a[start] == dq.peekFirst()){
                    dq.removeFirst();
                }
                start++;
                end++;
        }
       }
    }
    public static void main(String[] args) {
        maxOfKSizedWindow(new int[] {3,4,5,6,7}, 5);
     Queue<Integer> q = new ArrayDeque<>();
    
    }
}
