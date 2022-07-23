import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Hashtable<Integer,Integer> h=new Hashtable<>();
        for(int i:nums)
        {
            if(h.containsKey(i))
                return true;
           else
               h.put(i,i);
        }
        return false;
    }
}