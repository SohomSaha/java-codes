import java.util.*;
class Solution {
    public int[] findErrorNums(int[] nums) {
    int[]res=new int[2];
        for(int i:nums)
        {
            if(nums[Math.abs(i)-1]<0)res[0]=Math.abs(i);
            else
                nums[Math.abs(i)-1]*=-1;
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(nums[i-1]>0) res[1]=i ;
        }
          return res;  
    }
}