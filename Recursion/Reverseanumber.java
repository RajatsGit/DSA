package Recursion;

public class Reverseanumber {
    public static void main(String[] args) {
        int n = 12121;
        int count=0;
        int x = n;
        while(x!=0){
            x = x/10;
            count++;
        }
        System.out.println(reverse(n,count));
        int z = reverse(n, count);
       System.out.println( isPalindrome(z,n));
        
    }
    static int reverse(int n,int count){
        if(n <= 9 || count <= 1){
            return n;
        }
        return ((n%10)*(int)(Math.pow(10 ,count-1)) + reverse(n/10, count-1)); 
    }
    static boolean isPalindrome(int x, int y){
        return x==y;
    }

}
