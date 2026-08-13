class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);
        return recur(n-1,m-1,nums1,nums2,dp);
    }
    public int recur(int i,int j,int[] n1,int[] n2,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(n1[i]==n2[j]) return dp[i][j]=1+ recur(i-1,j-1,n1,n2,dp);
        else{
            int l=recur(i-1,j,n1,n2,dp);
            int r=recur(i,j-1,n1,n2,dp);
            return dp[i][j]=Math.max(l,r);
        }
    }
}