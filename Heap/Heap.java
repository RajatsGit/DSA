package Heap;

import java.util.ArrayList;
import java.util.Arrays;

public class Heap {
    static int index;
    static int arr[];
     Heap(){
        this.index = 0;
        this.arr = new int [100];
     }
    public static void insert(int value){
        arr[index] = value;
        uphipify(index);
        index++;
    }
    private static void uphipify(int index) {
         if(index < 1){return;}
         int parent = (index-1)/2;
         if(arr[parent] < arr[index]){
            int temp = arr[index];
            arr[index] = arr[parent];
            arr[parent] = temp;
            uphipify(parent);
         }
    }
    public static void delete(){
        if(index == 1){return;}
        // System.out.println(arr[0]+" ");
        arr[0] = arr[index-1];
        arr[index-1] = 0;
        index--;
        downhipify(0);

    }
    private static void downhipify(int i) {
    int largest = i;
    int l = 2*i+1;
    int r = 2*i+2;
    if(l < index-1 && arr[largest] < arr[l]){
        largest = l;
    }
    if(r < index-1 && arr[largest] < arr[r]){
        largest = r;
    }
    if(largest != i){
        int temp = arr[largest];
        arr[largest] = arr[i];
        arr[i] = temp;
        downhipify(largest);
    }
    }
    public static void print(){
        for(int i=0; i < index;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Heap heap = new Heap();
        
        insert(10);
        insert(8);
        insert(15);
        insert(3);
        insert(7);
        insert(18);
        insert(1);
        insert(11);
        // insert(-1);
        print();
        delete();
        delete();
        // delete();
        print();
        // System.out.println(Arrays.toString(heap.arr));

    }
}
