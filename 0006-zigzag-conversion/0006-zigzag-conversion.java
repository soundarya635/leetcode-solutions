class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        HashMap<Integer,StringBuilder> map=new HashMap<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<numRows;i++){
            map.put(i,new StringBuilder());
        }
        int k=0,m=numRows-1;
        boolean up=true;
        for(char ch:s.toCharArray()){
            map.get(k).append(ch);
            if(up){
                
                if(k==numRows-1){
                    k--;
                    up=false;
                    continue;
                }
                k++;
            }
            else{
                
                if(k==0){
                    k++;
                    up=true;
                    continue;
                }
                k--;
            }
        }
        for(int i=0;i<numRows;i++){
            ans.append(map.get(i));
        }
        return ans.toString();
    }
}