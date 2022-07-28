import java.util.*;
class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>(nums.length);
        int max=0;
        for(int i:nums)
            map.put(i,map.getOrDefault(i,0)+1);
        for(int i:map.keySet())
        {
            if(map.containsKey(i+1))
                max=max>map.get(i)+map.get(i+1)?max:map.get(i)+map.get(i+1);        
        }
        return max;
    }
}