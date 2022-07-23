import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Hashtable<Integer,Integer>h=new Hashtable<>();
        int rmv=0;
        for(int i=0;i<nums.length;i++)
        {
                if(h.containsKey(nums[i])&& Math.abs(i-h.get(nums[i]))<=k)
                    return true;
                h.put(nums[i],i);
        }
        return false;
    }
}