import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Hashtable<Integer,Integer>h=new Hashtable<>();
        int res=nums[0];int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(!h.containsKey(nums[i]))
                h.put(nums[i],1);
            else
            {
                int t=h.get(nums[i]);
                h.put(nums[i],++t);
                if(t>n/2)
                    return nums[i];
            }
        }
        return res;
    }
}