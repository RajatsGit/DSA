package Main;
import java.util.*;

public class largestAreaofHistogram {
    public static void main(String[] args) {
        int a[] = { 6, 2, 5, 4, 5, 1, 6};
        int areaOfEachBar = 0;
        int i=0;
        int maxArea=0;
        Stack<Integer> st = new Stack<>();
        while(i<a.length){
            if(st.isEmpty() || a[i] >= a[st.peek()]){
                st.push(i);
                i++;
            }
            else{
                int x = st.peek();
                st.pop();
                areaOfEachBar = a[x] *(st.isEmpty() ? i : i-st.peek()-1);
                maxArea = Math.max(areaOfEachBar,maxArea);
            }
        }
        while(st.isEmpty() == false){
            int pop = st.peek();
            st.pop();
            areaOfEachBar = a[pop] * (st.isEmpty() ? i:i-st.peek()-1);
            maxArea = Math.max(areaOfEachBar,maxArea);
        }
     System.out.println(maxArea);
    }
}
