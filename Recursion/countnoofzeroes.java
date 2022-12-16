package Recursion;

public class countnoofzeroes {
    public static void main(String[] args) {
        System.out.println(countzeroes(102030, 0));
    }
    static int countzeroes(int n, int count){
       if(n == 0){
        return count;
       }
        int x  = n%10;
        if(x == 0){
        return  countzeroes(n/10, count+1);
        }
        return countzeroes(n/10, count);
    }
}
