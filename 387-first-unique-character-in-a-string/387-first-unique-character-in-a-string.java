import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),s.length());
            else
                map.put(s.charAt(i),i);
        }
        if(map.size()==0)
            return -1;
        for(int i=0;i<s.length();i++)
        {
            if(map.containsValue(i))
                return i;
        }
        return -1;
    }
}