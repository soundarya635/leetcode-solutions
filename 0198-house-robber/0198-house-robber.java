class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return recur(nums.length-1,nums,dp);
    }
    public int recur(int i,int[] nums,int[] dp){
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int rob=nums[i]+recur(i-2,nums,dp);

        int notrob=recur(i-1,nums,dp);
        return dp[i]= Math.max(rob,notrob);
    }
}