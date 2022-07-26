import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int count=0;
        for(char ch: s.toCharArray())
        {
            if(map.containsKey(ch))
            {
             count++;
                map.remove(ch);
            }
            else
                map.put(ch,0);
        }
        return (count*2)+(map.isEmpty()?0:1);
    
    }
}