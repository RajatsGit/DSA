package Main;

import java.util.Deque;
import java.util.LinkedList;

public class SumofMaximumandMinimumofAllSubArrayOfSizeK {
 public static int sumofmaximumofallsubarrayofSizeK(int a[],int k){
    int start=0,end=0,maxsum=0;
    Deque<Integer> dq = new LinkedList<>();
    while(end<a.length){
        while(!dq.isEmpty() && dq.peekLast() < a[end]){
            dq.removeLast();
        }
        dq.addLast(a[end]);
        if(end-start+1 < k){
            end++;
        }
        else{
            maxsum += dq.peekFirst();
            if(a[start] == dq.peekFirst()){
                dq.removeFirst();
            }
            start++;
            end++;
        }
    }
 return maxsum;}
 public static int sumofminiimumofallsubarrayofSizeK(int a[],int k){
    int start=0,end=0,minsum=0;
    Deque<Integer> dq = new LinkedList<>();
    while(end<a.length){
        while(!dq.isEmpty() && dq.peekLast() > a[end]){
            dq.removeLast();
        }
        dq.addLast(a[end]);
        if(end-start+1 < k){
            end++;
        }
        else{
            minsum += dq.peekFirst();
            if(a[start] == dq.peekFirst()){
                dq.removeFirst();
            }
            start++;
            end++;
        }
    }
 return minsum;}
 public static void main(String[] args) {
    int max = sumofmaximumofallsubarrayofSizeK(new int[] {1,2,3}, 3);
    int min = sumofminiimumofallsubarrayofSizeK(new int[] {1,2,3}, 3); 
 System.out.println(min+max); 
}
}
