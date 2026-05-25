class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[k]!=nums[i]){
                int t=nums[k+1];
                nums[++k]=nums[i];
                nums[i]=t;
            }
        }
        System.out.print(k);
        return k+1;
    }
}