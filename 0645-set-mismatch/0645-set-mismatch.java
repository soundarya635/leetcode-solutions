class Solution {
    public int[] findErrorNums(int[] nums) {
        int res[]=new int[2];
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])) res[0]=nums[i];
            h.put(nums[i],nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(h.get(i)==null) res[1]=i;
        }
        
        
        return res;
        
    }
}