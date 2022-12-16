package Recursion;

public class rotatatedbinarysearch {
    public static void main(String[] args) {
        System.out.println(search(new int[] {5,6,7,8,1,2,3,4}, 9, 0, 7));
        System.out.println(search(new int[] {5,6,7,8,1,2,3,4}, 9));
    }
    static int search(int []a,int target){
        int start = 0,end= a.length-1;
        while(start < end){
            int mid = start+ (end-start)/2;
            if(a[mid] == target){
                return mid;
            }
            if(a[start] <= a[mid]){
                if(target > a[start] && target < a[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
            if(target >= a[mid] && target <= a[end]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }}
        }
        return a[start] == target? start:-1;
    }
    static int search(int a[], int k, int start,int end){
        if(start > end){
            return -1;
        }
        int mid = start +(end-start)/2;
        if(a[mid] == k ){
            return mid;
        }
        if(a[start] <= a[mid]){
            if(a[start] < k && a[mid] > k){
                return search(a,k,start,mid-1);
            }else{
                return search(a, k, mid+1, end);
            }
        }else{
        if(k >= a[mid] && k<= a[end]){
            return search(a, k, mid+1, end);
        }
        else{
            return search(a, k, start, mid-1);
        }}
    }
}
