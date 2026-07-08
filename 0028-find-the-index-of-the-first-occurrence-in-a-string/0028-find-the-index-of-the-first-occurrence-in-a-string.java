class Solution {
    public int strStr(String s, String n) {
        
        
        if(s.length()<n.length()) return -1;
        for(int i=0;i<s.length();i++){
            int j=i;int k=0;
            while(k<n.length()&& j<s.length()){
                if(s.charAt(j)!=n.charAt(k)) break;
                k++;j++;
            }
            if(k==n.length()) return i;
        }
        return -1;
    }
}