package Main;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int []a = {10,4,5,90,120,80};
        int n= a.length;
        int ans[] = new int[n];
        ans[0] = 1;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && a[i] >= a[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = i+1;
            }
            else{
                ans[i] = i-st.peek();
            }
            st.push(i);
        }
      for(int i=0;i<n;i++){
        System.out.print(ans[i]+" ");
      }
    }
}
