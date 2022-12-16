package Main;

public class recursion {
    public static void main(String[] args) {
        
    }
    public static int maxPathSum(int [][]arr,int i,int j){
        if(j >= arr[0].length){
            return arr[i][j];
        }
        int maxcost1=Integer.MAX_VALUE,maxcost2 = Integer.MAX_VALUE,maxcost3=Integer.MAX_VALUE;
        if(i > arr.length-1){
            maxcost1 = maxPathSum(arr, i-1, j+1);
            maxcost2 = maxPathSum(arr, i, j+1);
        }
        if(i < 1){
            maxcost2 = maxPathSum(arr, i, j+1);
            maxcost3 = maxPathSum(arr, i+1, j+1);
        }   
             maxcost1 = maxPathSum(arr, i-1, j+1);
             maxcost2 = maxPathSum(arr, i, j+1);
             maxcost3 = maxPathSum(arr, i+1, j+1);
        return Math.max(Math.max(maxcost1,maxcost2),maxcost3) + arr[i][j];
    }
}
