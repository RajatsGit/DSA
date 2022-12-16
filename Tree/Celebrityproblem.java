package Tree;

import java.util.Scanner;
import java.util.Stack;

public class Celebrityproblem {
    public static void knows(Stack<Integer>st,int a[][],int x, int y){
      if(a[x][y] == 1){
        st.push(y);
      }else if(a[y][x] == 1){
        st.push(x);
      }
    }
    public static int isCelebrity(int a[][],int x){
       for(int i=0;i<a[0].length;i++){
        if(a[x][i] == 1 && i != x){
          return -1;
        }
    }
    for(int i=0;i<a[0].length;i++){
        if(a[i][x] == 0 && i != x){
            return -1;
          }}   
      return x;}
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          int n = sc.nextInt();
          int a[][] = new int [n][n];
          for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                  a[i][j] = sc.nextInt();
              }
          }
          Stack<Integer> st = new Stack<>();
          for(int i=0;i<n;i++){
              st.push(i);
          }
          while(st.size() != 0 && st.size() != 1){
              int x = st.pop();
              int y = st.pop();
              knows(st,a,x,y);
          }
          if(st.isEmpty()){
              System.out.println("false");
          }
             int z = st.pop();
             System.out.println(isCelebrity(a,z));
        }

    }

}
