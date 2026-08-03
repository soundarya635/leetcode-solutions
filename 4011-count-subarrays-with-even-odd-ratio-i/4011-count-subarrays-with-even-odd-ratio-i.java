class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
       int c=0;
        for(int r=0;r<nums.length;r++){
            int o=0,e=0;
            for(int j=r;j<nums.length;j++){
                if(nums[j]%2==0) e++;
                else o++;
                if(o>0 && (e*b <= a*o)) c++;
            }
            
        }
        return c;
    }
}