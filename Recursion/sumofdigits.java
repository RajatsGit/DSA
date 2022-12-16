package Recursion;

public class sumofdigits {
    public static void main(String[] args) {
        System.out.println(sumofdigits(43567));
    }
    public static int sumofdigits(int n){
        if(n<=9){
            return n;
        }
        return n%10 + sumofdigits(n/10);
    }
}
