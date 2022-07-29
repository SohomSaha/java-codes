import java.util.*;
class Solution {
    public int findShortestSubArray(int[] nums) {
     HashMap<Integer,int[]>map=new HashMap<>(nums.length);
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
                map.put(nums[i],new int[]{1,i,i});
            else
            {
                int []temp= map.get(nums[i]);
                temp[0]++;
                temp[2]=i;
            }
        }
        int degree=0,res=nums.length;
        for(int [] value:map.values())
        {
            if(value[0]>degree)
            {
                degree=value[0];
                res=value[2]-value[1]+1;
            }
            else if(value[0]==degree)
                res=Math.min(res,value[2]-value[1]+1);
        }
        return res;
    }
}