class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,n=fruits.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int r=0;r<n;r++){
            h.put(fruits[r],h.getOrDefault(fruits[r],0)+1);
            if(h.size()<=2){
                max=Math.max(max,r-l+1);
            }
            while(h.size()>2){
                 h.put(fruits[l],h.get(fruits[l])-1);
                 if(h.get(fruits[l])==0) h.remove(fruits[l]);
                 l++;
                 
            }
        }
         return max;
    }
}