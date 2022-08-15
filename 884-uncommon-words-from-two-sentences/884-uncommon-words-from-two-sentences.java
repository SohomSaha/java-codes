import java.util.*;
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer>map=new HashMap<String,Integer>();
        s1=s1+" "+s2;
        String[] w=s1.split(" ");
        for(String s:w)
        {
            if(map.containsKey(s))
                map.put(s,-1);
            else
                map.put(s,0);
        }
        List<String>list=new ArrayList<String>();
        for(String s:map.keySet())
        {
            if(map.get(s)!=-1)
                list.add(s);
        }
        return list.toArray(new String[0]);
    }
}