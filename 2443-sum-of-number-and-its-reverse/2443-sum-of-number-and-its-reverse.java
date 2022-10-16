class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num<10)
            return num%2==0 ;
        for(int i=1;i<=num/2;i++)
        {
            if(i==reverse(num-i))
                return true;
        }
        return false;
    } 
    public int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
            rev=(rev*10)+(n%10);
            n/=10;
        }
        return rev;
    }
}