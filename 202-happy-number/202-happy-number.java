import java.util.Map;
class Solution {
    public int sumofsqdigits(int n)
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
        HashMap<Integer,Integer>h=new HashMap<>();
        h.put(n,0);
        while(n!=1)
        {
            n=sumofsqdigits(n);
            if(!h.containsKey(n))
                h.put(n,0);
            else
                return false;
        }
        return true;
    }
}