class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        int one=recur(nums,0,dp,n-1);
        Arrays.fill(dp,-1);
        int two=recur(nums,1,dp,n);
        return Math.max(one,two);
    }
    public static int recur(int [] nums,int i,int[] dp,int n){
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        int rob=nums[i]+ recur(nums,i+2,dp,n);
        int skip=recur(nums,i+1,dp,n);
        return dp[i]=Math.max(rob,skip);
        
    }
    

}