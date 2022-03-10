class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,max=sum,max1=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(sum<0)
                sum=nums[i];
            else
            sum+=nums[i];
            max=Math.max(sum,max);
            max1=Math.max(max1,nums[i]);
        }
        if(max==0)
            return max1;
        return max;
    }
}