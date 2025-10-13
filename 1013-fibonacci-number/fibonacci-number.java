class Solution {
    public int fib(int n) {
        int i,t1=0,t2=1,res=0;
        if(n==0){
            return t1;}
        if(n==1){
            return t2;}
        for(i=2;i<=n;i++){
            res=t1+t2;
            t1=t2;
            t2=res;
        }
        return res;
    }
}