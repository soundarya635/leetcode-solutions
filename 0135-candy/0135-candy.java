class Solution {
    public int candy(int[] A) {
         int n=A.length;
       //write your code here 
       int res[]=new int[n];
       Arrays.fill(res,1);
       for(int i=1;i<n;i++){
           if(A[i-1]<A[i]) res[i]=res[i-1]+1;
       }
       for(int i=n-2;i>=0;i--){
           if(A[i]>A[i+1]) res[i]=Math.max(res[i],res[i+1]+1);
       }
       int c=0;
       for(int i:res){
           c+=i;
       }
       return c;
    }
}