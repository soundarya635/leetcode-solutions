class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        double max=Integer.MIN_VALUE;double sum=0;
        
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            if(k==r-l+1){
                max=Math.max(max,sum/k);
                sum-=nums[l];
                l++;
            }

        }
        return max;
    }
}