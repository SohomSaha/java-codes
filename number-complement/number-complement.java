
class Solution {
    public int findComplement(int num) {
        int bin =0,a=0,n=0;
        while (num>0)
        {if (num%2==1)
          bin=0;
         else
             bin=1; 
           n+=(bin*Math.pow(2,a));
               num/=2;a++;
        }/*num=0;
        while(bin>0)
        {
            num+=((bin%10)*Math.pow(2,a));
            bin=bin/10;
            a++;
        }*/
        return n;
    }
}