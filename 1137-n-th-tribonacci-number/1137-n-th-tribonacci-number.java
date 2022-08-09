class Solution {
    public int tribonacci(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        if(n==2)return 1;
        int sum=0,a=0,b=1,c=1;
        for(int i=3;i<=n;i++)
        {
            sum=a+b+c;
            a=b;
            b=c;
            c=sum;
        }
        return sum;
    }
}