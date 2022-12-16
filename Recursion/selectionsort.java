package Recursion;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int a[] = {5,4,3,2,1};
        selectionSort(a, a.length, 0, 0);
        System.out.println(Arrays.toString(a));
    }
    public static void selectionSort(int a[], int r, int c, int max){
        if(r == 0){
            return;
        }
        if(r > c){
            if(a[c] > a[max]){
                selectionSort(a, r, c+1, c);
            }else{
                selectionSort(a, r, c+1, max);
            }
        }else{
            int swap = a[c-1];
            a[c-1] = a[max];
            a[max]  = swap;
            selectionSort(a, r-1, 0, 0);
        }
    }
}
