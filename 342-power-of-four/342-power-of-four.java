class Solution {
    public boolean isPowerOfFour(int num) {
    for(int i=0;i<31;i+=2)
    {
        int a=1<<i;
        if(a==num)
            return true;
        if(a>num)
            return false;  
    }
        return false;
    }
}