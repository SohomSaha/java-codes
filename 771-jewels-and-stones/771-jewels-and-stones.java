import java.util.*;
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer>map=new HashMap<>(stones.length());
        for(char c:stones.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        int j=0;       
        for(char c:jewels.toCharArray())
        j+=map.getOrDefault(c,0);
        return j;
    }
}