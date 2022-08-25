import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>map=new HashMap<>();
       for(char c: magazine.toCharArray())
           map.put(c,map.getOrDefault(c,0)+1);
        for(int i=0;i<ransomNote.length();i++)
        {
            if(!map.containsKey(ransomNote.charAt(i))||map.get(ransomNote.charAt(i))==0)
                return false;
            else
                map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);    
        }
               return true;
    }
}