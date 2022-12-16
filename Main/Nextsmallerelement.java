package Main;
import java.util.Stack;
public class Nextsmallerelement {
    public static void main(String[] args) {
       /*Next smaller element*/
        int a[] = {5,4,3,2,1};
        int b[] = new int[a.length];
        Stack<Integer> st = new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            while(!st.isEmpty() && a[i] <= st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                b[i] = -1;
            }
            else{
                b[i] = st.peek();
            }
            st.push(a[i]);
        } 
        for(int i=0;i<a.length;i++){
            System.out.print(b[i]+" ");
          }    
    }
}
