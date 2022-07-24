import java.util.*;
class Solution {
    public boolean wordPattern(String p, String s) {
        String[] s1=s.split(" ");
        if(s1.length!=p.length())
            return false;
        HashMap<Character,String> map=new HashMap<>();
        for(int i=0;i<s1.length;i++)
        {
             if(!map.containsKey(p.charAt(i)))
             {
                 if(map.containsValue(s1[i]))
                     return false;
                map.put(p.charAt(i),s1[i]);
             }
            else
            {
                if(!map.get(p.charAt(i)).equals(s1[i]))
                    return false;
            }
        }
        return true;
    }
}