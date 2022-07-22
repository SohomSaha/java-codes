import java.util.*;
class Solution {
    public int romanToInt(String s) {
        Hashtable<Character,Integer> hash=new Hashtable<Character,Integer>();
        hash.put('I',1);
        hash.put('V',5);
        hash.put('X',10);
        hash.put('L',50);
        hash.put('C',100);
        hash.put('D',500);
        hash.put('M',1000);
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I'&&i!=s.length()-1)
            {
                if(s.charAt(i+1)=='V')
                   {sum+=4;i++;}
                else if(s.charAt(i+1)=='X')
                    {sum+=9;i++;}  
               else
               sum+=1;     
            }
           else if(s.charAt(i)=='X'&&i!=s.length()-1)
            {
                if(s.charAt(i+1)=='L')
                   {sum+=40;i++;}
                else if(s.charAt(i+1)=='C')
                    {sum+=90;i++;}  
                else
                sum+=10;      
            }
           else if(s.charAt(i)=='C'&&i!=s.length()-1)
            {
                if(s.charAt(i+1)=='D')
                   {sum+=400;i++;}
                else if(s.charAt(i+1)=='M')
                    {sum+=900;i++;}    
                else
                sum+=100;
            }
           else
               sum+=hash.get(s.charAt(i));
        }
        return sum;
    }
}