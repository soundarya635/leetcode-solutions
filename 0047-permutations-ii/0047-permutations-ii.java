class Solution {
    List<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        back(nums,0,new ArrayList<>(),new ArrayList<>());
        return l;
    }
    public void back(int[] nums,int i,ArrayList<Integer> in,ArrayList<Integer> a){
        if(a.size()==nums.length){
            if(!l.contains(new ArrayList<>(a))){
                l.add(new ArrayList<>(a));
            }
            return;
        }
        for(int j=0;j<nums.length;j++){
            if(in.contains(j)) continue;
            in.add(j);
            a.add(nums[j]);
            back(nums,j,in,a);
            in.remove(in.size()-1);
            a.remove(a.size()-1);
        }
        
    }     
}