class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int[][] dp=new int[t1.length()+1][t2.length()+1];
       
        for(int i=1;i<t1.length()+1;i++){
            for(int j=1;j<t2.length()+1;j++){
                if(t1.charAt(i-1)==t2.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        // for(int i=0;i<t1.length();i++) Arrays.fill(dp[i],-1);
        // return lcs(t1.length()-1,t2.length()-1,t1,t2,dp);
        return dp[t1.length()][t2.length()];

    }
    public int lcs(int i,int j,String t1,String t2,int[][] dp){
        if(i<0 || j< 0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(t1.charAt(i)==t2.charAt(j)) return dp[i][j]=1+ lcs(i-1,j-1,t1,t2,dp);
        else{
            int l=lcs(i,j-1,t1,t2,dp);
            int r=lcs(i-1,j,t1,t2,dp);
            return dp[i][j]=Math.max(l,r);
       }
    }
}