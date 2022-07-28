import java.util.*;
class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>(nums.length);
        int max=0;
        for(int i:nums)
            map.put(i,map.getOrDefault(i,0)+1);
        for(int i:nums)
        {
            if(map.containsKey(i+1))
            {
               int count=map.get(i)+map.get(i+1);
                max=max>count?max:count;        
            }
        }
        return max;
    }
}