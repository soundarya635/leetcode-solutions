class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(k,nums)-atmost(k-1,nums);
    }
    static int atmost(int k,int nums[]){
        int l=0,r=0,ans=0;
        HashMap<Integer,Integer> h=new HashMap<>();

        while(r<nums.length){
            h.put(nums[r],h.getOrDefault(nums[r],0)+1);

            while(h.size()>k){
                h.put(nums[l],h.get(nums[l])-1);
                if(h.get(nums[l])==0) h.remove(nums[l]);
                l++;
            }
            ans+=r-l+1;
            r++;
        }
        return ans;
    }
}