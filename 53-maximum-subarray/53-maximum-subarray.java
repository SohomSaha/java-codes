class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,max=sum;
        for(int i=0;i<nums.length;i++)
        {
            if(sum<0)
                sum=nums[i];
            else
            sum+=nums[i];
            max=Math.max(sum,max);
        }
        Arrays.sort(nums);
        if(max==0 && nums[nums.length-1]!=0)
            return nums[nums.length-1];
        return max;
    }
}