class Solution {
    public int sum(long n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public long makeIntegerBeautiful(long n, int target) {
        int s1=sum(n);
        long c=1,carry=0,ans=0,d;
        while(s1+carry>target)
        {
            d=n%10;
            n/=10;
            ans=(10-d-carry)*(c)+ans;
            s1-=d;
            c*=10;
            carry=1;
        }
        return ans;
    }
}