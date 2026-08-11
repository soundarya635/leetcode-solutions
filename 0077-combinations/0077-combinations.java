class Solution {
    ArrayList<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        back(n,k,1,new ArrayList<>());
        return l;
    }
    public void back(int n,int k,int i,ArrayList<Integer> a){
        //if(i>n) return;
        if(a.size()==k){
            l.add(new ArrayList<>(a));
            return;
        }
        for(int j=i;j<=n;j++){
            a.add(j);
            System.out.print(a);
            back(n,k,j+1,a);
            a.remove(a.size()-1);
        }
        return;
    }
}