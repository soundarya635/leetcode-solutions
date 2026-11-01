class Solution {
    public int[] twoSum(int[] nums, int t) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int s[]=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            int d=t-nums[i];
            if(h.containsKey(d)){
                s[k++]=h.get(d);
                s[k++]=i;
                break;
            }
            h.put(nums[i],i);
        }
        return s;
    }
}