class Solution {
    int num[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String sys[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public String intToRoman(int n) {
        String s="";
        for(int i=0;i<num.length;i++){
            while(n>=num[i]){
                s+=sys[i];
                n-=num[i];
            }
        }
        return s;
    }
}