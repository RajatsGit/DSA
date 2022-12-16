package Main;

import java.util.Deque;
import java.util.LinkedList;

public class firstNegativenumberineveryKSizedWindow {
    public static void firstnegativeKSizedwindow(int []a,int k){
        int start=0,end=0;
        Deque<Integer> dq = new LinkedList<>();
        while(end<a.length){
            if(a[end] < 0){
                dq.addLast(a[end]);
            }
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
        firstnegativeKSizedwindow(new int[] {2,3,-1,-7,4,-3,6,8,-2}, 3);
    }
}
