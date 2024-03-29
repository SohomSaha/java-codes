class Solution {
    public double myPow(double x, int n) {
        if(n==0||x==1)
            return 1;
        if(x==0)
            return 0;
        if(n<0)
        {
            n=-n;
            x=1/x;
        }
        if(x!=1&&x!=-1&&n==-2147483648)
            return 0;
        return n%2==0?myPow(x*x,n/2):x*myPow(x*x,n/2);
    }
}