class Solution {
     ArrayList<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] c, int t) {
        back(c,t,new ArrayList<>(),0,0);
        return l;
    }
    public void back(int[] c,int t,ArrayList<Integer> a,int i,int sum){
        if(i>=c.length || sum>t) return;
        if(sum==t){
            l.add(new ArrayList<>(a));
            return;
        }
        for(int k=i;k<c.length;k++){
            a.add(c[k]);
            back(c,t,a,k,sum+c[k]);
            a.remove(a.size()-1);
        }
        return;
    }
}