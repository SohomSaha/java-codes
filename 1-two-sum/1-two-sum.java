class Solution {
    public int[] twoSum(int[] nums, int target) {
           int[]b=new int[2];
        for(int i=0;i<nums.length;i++)
        {int j;
            for( j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {b[0]=i;b[1]=j;break;}
            }
            if(b[1]==j)
                break;
        }
        return b;
    }
}