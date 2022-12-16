package Main;
import java.util.*;
/*Merge Intervals in 2d array*/
class Pairinterval{
    int start;
    int end;
    Pairinterval(int start,int end){
        this.start = start;
        this.end = end;
    }}
    public class Merge2dinterval {
    public static void mergeIntervals(Pairinterval arr[]){
    Arrays.sort(arr,new Comparator<Pairinterval>() {
        public int compare(Pairinterval i1,Pairinterval i2){
            return i1.start-i2.start;
        }
    });
    int index=0;
    for(int i=1;i<arr.length;i++){
        if(arr[index].end >= arr[i].start){
            arr[index].end = Math.max(arr[index].end,arr[i].end);
        }
        else{
            index++;
            arr[index] = arr[i];
        }}
    for(int i=0;i<=index;i++){
        System.out.print("["+arr[i].start + "," + arr[i].end +"]");
    }}
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();   
 Pairinterval arr[] = new Pairinterval[n];
 for(int i = 0;i<n;i++){
    arr[i] = new Pairinterval(sc.nextInt(), sc.nextInt());
 }   
  mergeIntervals(arr);
}
}
