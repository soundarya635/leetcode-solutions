class Solution {
    public int uniquePathsWithObstacles(int[][] o) {
        int m=o.length;
        int n=o[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++) Arrays.fill(dp[i],-1);
        return recur(m-1,n-1,o,dp);
    }
    public int recur(int i,int j,int[][] o,int[][] dp){
        if(i<0 || j<0) return 0;
        if(o[i][j]==1) return 0;
        if(i==0 && j==0) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=recur(i-1,j,o,dp) + recur(i,j-1,o,dp);
    }
}