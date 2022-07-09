class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int i=0,e=0;
        if(digits[n-1]==9)
        {
            digits[n-1]=0;
            i=index(digits,n-2);
        
            if(i!=-1)
             digits[i]+=1;
            else
            e=1;  
        }
        else
            digits[n-1]+=1;
        if(i!=-1)    
            return digits;
        else
        {
            int []res=new int[n+1];
            res[0]=e;
            for(int j=1;j<=n;j++)
                res[j]=digits[j-1];
            return res;
        } 
    }
    public int index(int[] digits,int i)
    {
           if(i<0)
                return -1; 
        if(digits[i]==9)
        {
            digits[i]=0;
            return index(digits,i-1);
        }
        return i;  
    }    
}