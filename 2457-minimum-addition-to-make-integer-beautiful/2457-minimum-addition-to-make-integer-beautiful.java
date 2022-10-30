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
        if(s1<=target)
            return 0;
        long temp=n;
        int count=0;
        while(temp!=0)
        {
            temp/=10;
            count++;
        }
        int[]arr=new int[count];
        System.out.println(n);
        for(int i=0;i<count;i++)
        {
            arr[i]+=n%10;
            n/=10;
        }
        //System.out.println(Arrays.toString(arr));
        long ans=0;
        long c=1,carry=0;
        for(int i=0;i<count;i++)
        {
           // System.out.println(s1);
            if(s1+carry>target)
            {
                if(i==0)
                {
                    ans=10-arr[i];
                    carry=1;
                }
                else
                    ans=(9-arr[i])*(c)+ans;
                s1-=arr[i];
                c*=10;
               // System.out.println("ans ->"+ans);
            }
            else
                break;
        }
        return ans;
    }
}