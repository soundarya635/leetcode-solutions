class Solution {
    public int minPathSum(int[][] g) {
        int n=g.length;
        int m=g[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);
        return recur(dp,g,n-1,m-1);
    }
    public int recur(int dp[][],int g[][],int i,int j){
        if(i<0 || j< 0) return Integer.MAX_VALUE;
        if(i==0 && j==0) return g[i][j];
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j]=g[i][j] + Math.min(recur(dp,g,i-1,j),recur(dp,g,i,j-1));
    }
}