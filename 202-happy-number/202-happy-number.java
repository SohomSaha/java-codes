import java.util.Map;
class Solution {
    public int getNext(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=((n%10)*(n%10));
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int sr=n;
        int fr=getNext(n);
        while(fr!=1)
        {
            if(sr==fr)
                return false;
            sr=getNext(sr);
            fr=getNext(getNext(fr));
        }
        return fr==1;
    }
}