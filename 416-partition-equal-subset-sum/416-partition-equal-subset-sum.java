class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums)
            sum+=i;
        return sum%2==0?partition(nums,nums.length-1,sum/2,new Integer[nums.length][sum/2+1]):false;
    }
    public boolean partition(int[]nums,int ind,int target,Integer[][]dp)
    {
        if(target==0)
            return true;
        if(ind==0)
            return nums[0]==target;
        if(dp[ind][target]!=null)
            return dp[ind][target]==1;
        boolean notake=partition(nums,ind-1,target,dp);
        boolean take=false;
        if(nums[ind]<=target)
            take=partition(nums,ind-1,target-nums[ind],dp);
        dp[ind][target]=take||notake?1:0;
        return notake||take;
    }
}