import java.util.Arrays;

public class NewMain {
public static void main(String[] args) {
    // System.out.println(countVowelStrings(2));
    // System.out.println(change(8, new int[] {2,3,5,7}));
    System.out.println(change2(8, new int[] {2,3,5,7}));
    // System.out.println(longestCommonSubsequence("abcde", "bcdef"));


}  public static int change2(int amount, int[] coins) {
    if(amount==0)return 1;
    
        if(coins.length==1 && coins[0]==amount)return 1;
        int dp[][]=new int[amount+1][coins.length+1];
        for(int i[]: dp){
            Arrays.fill(i,-1);
        }
        
        return count(amount,coins,0,coins.length,dp);
    }
    public static int count(int sum,int coin[],int i,int n,int dp[][]){
        if(sum==0)return 1;
        if(i>=n || sum<0)return 0;
        
        if(dp[sum][i]!=-1)return dp[sum][i];        /*{2,3,5,7} - 8*/
        
        int in=count(sum-coin[i],coin,i,n,dp);
        int en=count(sum,coin,i+1,n,dp);
    
        return dp[sum][i]=in+en;
    }
public static int longestCommonSubsequence(String text1, String text2) {
            return helper(text1,text1.length(),text2,text2.length());
        }
        public static int helper(String text1,int n, String text2,int m){
            if(n == 0 || m == 0){return 0;}
            if(text1.charAt(n-1) == text2.charAt(m-1)){
                return 1 + helper(text1,n-1,text2,m-1);
            }
            return Math.max(helper(text1,n-1,text2,m),helper(text1,n,text2,m-1));
        }  
public static int countVowelStrings(int n) {
    String voWel = "aeiou";
    return helper(voWel,0,n);
}
public static int helper(String v,int index,int n){
    if(n == 0){return 1;}
    int result = 0;
    for(int i=index;i<v.length();i++){
        result += helper(v,i,n-1);
    }
return result;
}
public static int change(int amount, int[] coins) {
    // int dp[] = new int[coins.length];
    return helper(amount,coins,0);
}
public static int helper(int amount,int[]coins,int n){
if(amount < 0){return 0;}                             /*{2,3,5,7} - 8*/
if(amount == 0){return 1;}
    int count = 0;
    for(int i = n ;i< coins.length;i++){
        count += helper(amount-coins[i],coins,i);   
    }

    return count;
}
}
