class Solution {
    public int minDistance(String w1, String w2) {
        int dp[][]=new int[w1.length()+1][w2.length()+1];
        if(w1.length()==0) return w2.length();
        if(w2.length()==0) return w1.length();
        for(int i=0;i<=w1.length();i++) dp[i][0]=i;
        for(int i=0;i<=w2.length();i++) dp[0][i]=i;

        for(int i=1;i<=w1.length();i++){
            for(int j=1;j<=w2.length();j++){
                if(w1.charAt(i-1)==w2.charAt(j-1)) dp[i][j]=dp[i-1][j-1];
                else{
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                }
            }
        }
        return dp[w1.length()][w2.length()];

        // for(int i=0;i<w1.length();i++) Arrays.fill(dp[i],-1);
        // return recur(w1,w2,dp,w1.length()-1,w2.length()-1);
    }
    public int recur(String s1,String s2,int[][] dp,int i,int j){
        
        if(i<0) return j+1;
        if(j<0)return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]=recur(s1,s2,dp,i-1,j-1);
        else{
            int p1=recur(s1,s2,dp,i,j-1);
            int p2=recur(s1,s2,dp,i-1,j);
            int p3=recur(s1,s2,dp,i-1,j-1);
            return dp[i][j]=1+Math.min(p1,Math.min(p2,p3));
        }
    }
}