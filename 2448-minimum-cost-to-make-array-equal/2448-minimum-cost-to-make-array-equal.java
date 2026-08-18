class Solution {
    public long minCost(int[] nums, int[] cost) {
        long low=0,high=0;
        for(int i=0;i<nums.length;i++){
            low=Math.min(low,nums[i]);
            high=Math.max(high,nums[i]);
        }

        long ans=Long.MAX_VALUE;
        while(low<=high){
            long mid=low+ (high-low)/2;
            long x=cost(mid,nums,cost);
            long y=cost(mid+1,nums,cost);
            ans=Math.min(ans,Math.min(x,y));
            if(x<=y){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public long cost(long m,int a[],int c[]){
    long cost=0;
        for(int i=0;i<a.length;i++){
            cost+=Math.abs(m-a[i])*c[i];
        }
        return cost;
    }
}