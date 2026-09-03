class Solution {
    public int[] getAverages(int[] nums, int k) {
        int l=0,len=(2*k)+1;
        long sum=0;
        int ans[]=new int[nums.length];
        Arrays.fill(ans,-1);
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            if((r-l+1)==len) {
                
                ans[l+k]=(int)(sum/len);
                
                sum-=nums[l++];
            }
        }
        
        return ans;
    }
}