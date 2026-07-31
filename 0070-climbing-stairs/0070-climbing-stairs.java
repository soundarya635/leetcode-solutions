class Solution {
     int dp[];
    public int climbStairs(int n) {
        dp=new int[n+1];
        return recur(n);
    }
    public int recur(int n){
        if(n==1 || n==2 ) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n]=recur(n-1) + recur(n-2);
    }
}