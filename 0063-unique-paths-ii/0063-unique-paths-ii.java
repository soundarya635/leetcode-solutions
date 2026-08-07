class Solution {
    public int uniquePathsWithObstacles(int[][] o) {
        int m=o.length;
        int n=o[0].length;
        if(o[0][0]==1) return 0;
        int dp[][]=new int[m][n];
        dp[0][0]=1;
        for(int i=1;i<m;i++){
            if(o[i][0]==1) dp[i][0]=0;
            else dp[i][0]=dp[i-1][0];
        }
        for(int i=1;i<n;i++){
            if(o[0][i]==1) dp[0][i]=0;
            else dp[0][i]=dp[0][i-1];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(o[i][j]==1) dp[i][j]=0;
                else dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];

        // for(int i=0;i<m;i++) Arrays.fill(dp[i],-1);
        // return recur(m-1,n-1,o,dp);
    }
    // public int recur(int i,int j,int[][] o,int[][] dp){
    //     if(i<0 || j<0) return 0;
    //     if(o[i][j]==1) return 0;
    //     if(i==0 && j==0) return 1;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     return dp[i][j]=recur(i-1,j,o,dp) + recur(i,j-1,o,dp);
    // }
}