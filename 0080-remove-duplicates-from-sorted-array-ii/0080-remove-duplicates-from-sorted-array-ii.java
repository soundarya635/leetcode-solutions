class Solution {
    public int removeDuplicates(int[] nums) {
        int s=0,l=1,k=1,c=1;
        while(l<nums.length){
            
            if(nums[s]==nums[l]&& c<2){
                nums[s++]=nums[l];
                nums[s]=nums[l++];
                c++; k++;
            }else if(nums[s]==nums[l] && c==2) l++;
            else {
                
                nums[++s]=nums[l];l++;
                c=1; k++;
            }
           
        }
        return k;
    }
}