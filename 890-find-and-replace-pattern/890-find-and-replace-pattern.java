import java.util.*;
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String>list=new ArrayList<String>();
        for(int i=0;i<words.length;i++)
        {
            HashMap<Character,Character>map=new HashMap<>(pattern.length());
        if(words[i].length()!=pattern.length())
            continue;
        int check=0;    
            for(int j=0;j<pattern.length();j++)
            {
                char c1=words[i].charAt(j);
                char c2=pattern.charAt(j);
                if(!map.containsKey(c1)&&map.containsValue(c2))
                {check=1;break;}
                if(!map.containsKey(c1))
                    map.put(c1,c2);
                else
                {
                    if(map.get(c1)!=c2)
                    { check=1;break;}
                }
            }
            if(check==0)
                list.add(words[i]);
    }
        return list;
}
}