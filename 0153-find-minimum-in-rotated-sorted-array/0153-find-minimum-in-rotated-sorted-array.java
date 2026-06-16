class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1;int min=Integer.MAX_VALUE;
        while(l<=r){
            int mid= l+ (r-l)/2;
            if(nums[mid]<min) min =nums[mid];
            if(nums[l]<=nums[mid]){
                if(mid+1 < nums.length && nums[l]<nums[r]) {
                    r=mid-1;
                }else l=mid+1;
            }else{
                if(nums[mid]<nums[l]) r=mid-1;
                else l=mid+1;

            }
        }
        return min;
    }
}