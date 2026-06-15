class Solution {
    public String convert(String s, int n) {
        if(n>=s.length()|| n==1) return s;
        int i=0,j=0,col=0;
        int c=0;
        int l=s.length();
        char ans[][]=new char[n][l];
        while(i<n|| j<l){
            int f=0;
            if(i==0){
                while(i<n){
                    if(c>=l) {
                        f=1;
                        break;
                    }
                    ans[i][j]=s.charAt(c);
                    c++;i++;
                }i--;
                i--;j++;
            }
            while(i!=0){
                if(c>=l) {
                    f=1;break;
                }
                ans[i][j]=s.charAt(c);
                c++;i--;j++;
            }
            if(f==1){
                col=j;break;
            }
        }
        StringBuilder t=new StringBuilder();
        for(int k=0;k<n;k++){
            for(int r=0;r<col;r++){
                if(ans[k][r]!='\u0000') t.append(ans[k][r]);
            }
        }
        return t.toString();
    }
}