import java.util.*;
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:licensePlate.toLowerCase().toCharArray())
        {
           if(c>='a'&&c<='z')
               map.put(c,map.getOrDefault(c,0)+1);
        }
        String res="";int min=15;
        for(String s:words)
        {
            Map<Character,Integer>temp=new HashMap<>();
            temp=new HashMap<>(map);
            for(char c:s.toCharArray())
            {
                if(temp.containsKey(c))
                { 
                    temp.put(c,temp.get(c)-1);
                    if(temp.get(c)==0)
                        temp.remove(c);
                }
            }
           if(temp.size()==0&&min>s.length())
           { res=s; min=s.length();}
        }
        return res;
    }
}