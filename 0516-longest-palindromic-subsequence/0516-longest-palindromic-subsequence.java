class Solution {
    public int longestPalindromeSubseq(String s) {
        int dp[][]=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            Arrays.fill(dp[i],-1);

        }
        return recur(s,0,s.length()-1,dp);
        
    }
    public int recur(String s,int f,int l,int[][] dp){
        if(f>=s.length() || l<0) return 0;
        if(dp[f][l]!=-1) return dp[f][l];
        if(s.charAt(f)==s.charAt(l)) return dp[f][l]=1+ recur(s,f+1,l-1,dp);
        else {
            int le=recur(s,f+1,l,dp);
            int r=recur(s,f,l-1,dp);
            return dp[f][l]=Math.max(le,r);
        }
    }
}