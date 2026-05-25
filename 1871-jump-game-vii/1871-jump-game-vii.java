class Solution {
    public boolean canReach(String s, int min, int max) {
        boolean[] dp =new boolean[s.length()];
        int n=s.length();
        dp[0]=true;
        int j=0;
        for(int i=0;i<dp.length;i++){
            if(dp[i]==true){
                int st=Math.max(j+1,i+min);
                int en=Math.min(n-1,i+max);
                while(st<=en){
                    if(s.charAt(st)=='0'){
                        dp[st]=true;
                    }
                    st++;
                }
                j=en;
            }
               
        }
        return dp[s.length()-1];
          
    }
}