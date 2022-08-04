import java.util.*;
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] p=paragraph.toLowerCase().split("[^a-z]+");
        HashMap<String,Integer>map=new HashMap<>();
        for(String s:p)
            map.put(s,map.getOrDefault(s,0)+1);
        for(String s:banned)
            map.remove(s);
        String res="";
        int max=0;
        for(String s:map.keySet())
        {
            if(map.get(s)>=max)
            {res=s;max=map.get(s);}
        }
        return res;
    }
}