class Solution {
    public int[] plusOne(int[] digits) {
        int plus=1;
       for(int i=digits.length-1;i>=0;i--)
       {
           if(digits[i]+plus>9)
               digits[i]=0;
           else
           {
               digits[i]+=1;
               plus=0;
               break;
           }
       }
        if(plus!=1)
            return digits;
        else
        {
            int []res=new int[digits.length+1];
            res[0]=1;
            return res;
        }
    }
}