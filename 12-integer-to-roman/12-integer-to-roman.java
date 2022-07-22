import java.util.*;
class Solution {
    public String intToRoman(int num) {
        Hashtable<Integer,String>h1=new Hashtable<Integer,String>();
        h1.put(0,"");
        h1.put(1,"I");
        h1.put(4,"IV");
        h1.put(5,"V");
        h1.put(9,"IX");
        h1.put(10,"X");
        h1.put(40,"XL");
        h1.put(50,"L");
        h1.put(90,"XC");
        h1.put(100,"C");
        h1.put(400,"CD");
        h1.put(500,"D");
        h1.put(900,"CM");
        h1.put(1000,"M");
        String s="";
        int i=1,j=0;
        int []arr={1,5,10,50,100,500,1000,4000};
        while(num!=0)
        {
            String add="";
            int d=(num%10)*i;
            if(h1.containsKey(d))
                 s=h1.get(d)+s;
            else
            {
                while(arr[++j]<d){}
                --j;
                add=h1.get(arr[j]);
                int extra;
                if(d<10)
                     extra=d-arr[j];
                else
                    extra=(d-arr[j])/i;
                while(extra!=0)
                {if(j%2==0)
                    add=add+h1.get(arr[j]);
                 else
                     add=add+h1.get(arr[j-1]);
                 extra--;
                 }
                s=add+s;
            }
            i*=10;num/=10;
        }
        return s;
        
    }
}