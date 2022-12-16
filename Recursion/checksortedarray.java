package Recursion;

public class checksortedarray {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[] {1,3,4}, 0));
    }
    static boolean isSorted(int a[], int start){
        if(start == a.length-1){
            return true;
        }
        // if (a[start] <= a[start+1]){
        //     return isSorted(a, start+1);
        // }
        return a[start]<=a[start+1] && isSorted(a, start+1);

    }
}
