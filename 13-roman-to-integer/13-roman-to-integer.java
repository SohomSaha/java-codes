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
            if(i!=s.length()-1 &&hash.get(s.charAt(i))<hash.get(s.charAt(i+1)))
            {   
                sum+=(hash.get(s.charAt(i+1))-hash.get(s.charAt(i)));
                i++;
            }
            else
            sum+=hash.get(s.charAt(i));
        }   
        return sum;
    }
}