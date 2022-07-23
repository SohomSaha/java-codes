import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Hashtable<Integer,Integer>h=new Hashtable<>();
        int max=1,res=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(!h.containsKey(nums[i]))
                h.put(nums[i],1);
            else
            {
                h.put(nums[i],h.get(nums[i])+1);
                if(max<h.get(nums[i]))
                {
                    max=h.get(nums[i]);
                    res=nums[i];
                }
            }
        }
        System.out.println(max);
        return res;
    }
}