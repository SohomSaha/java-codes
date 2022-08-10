class Solution {
    public int maxSubArray(int[] nums) {
      int local_max=0,global_max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            local_max=Math.max(nums[i],nums[i]+local_max);
            global_max=Math.max(global_max,local_max);
        }
        return global_max;
    }
}