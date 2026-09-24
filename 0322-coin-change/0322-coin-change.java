class Solution {
    public int coinChange(int[] coins, int amt) {
        int n=coins.length;
        int[][] dp=new int[n+1][amt+1];

        dp[0][0]=0;
        for(int i=1;i<amt+1;i++) dp[0][i]=amt+1;

        for(int i=1;i<n+1;i++){
            for(int j=0;j<amt+1;j++){
                if(coins[i-1]>j) dp[i][j]=dp[i-1][j];
                else dp[i][j]=Math.min(dp[i-1][j],dp[i][j-coins[i-1]]+1);
            }
        }

        if(dp[n][amt]>=amt+1) return -1;
        return dp[n][amt];
        }
}