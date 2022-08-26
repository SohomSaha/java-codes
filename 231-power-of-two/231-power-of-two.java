class Solution {
    public boolean isPowerOfTwo(int n) {
       for(int i=0;i<31;i++)
       {
           int a=1<<i;
           if(a==n)
               return true;
           if(a>n)
               return false;
       }
        return false;
    }
}