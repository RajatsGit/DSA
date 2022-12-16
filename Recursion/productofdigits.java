package Recursion;

public class productofdigits {
    public static void main(String[] args) {
        System.out.println(productofdigits(130));
    }
    public static int productofdigits(int n){
        if(n<=9){
            return n;
        }
        return n%10 * productofdigits(n/10);
    }
}
