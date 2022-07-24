import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] s1=s.split(" ");
        String[] p=pattern.split("");
        if(s1.length!=p.length)
            return false;
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<s1.length;i++)
        {
             if(!map.containsKey(p[i]))
             {
                 if(map.containsValue(s1[i]))
                     return false;
                map.put(p[i],s1[i]);
             }
            else
            {
                if(!map.get(p[i]).equals(s1[i]))
                    return false;
            }
        }
        return true;
    }
}