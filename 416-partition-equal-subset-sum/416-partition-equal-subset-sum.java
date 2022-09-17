class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums)
            sum+=i;
        int[][]dp=new int[nums.length][sum/2+1];
        for(int[]i:dp)
            Arrays.fill(i,-1);
        return sum%2==0?partition(nums,nums.length-1,sum/2,dp):false;
    }
    public boolean partition(int[]nums,int ind,int target,int[][]dp)
    {
        if(target==0)
            return true;
        if(ind==0)
            return nums[0]==target;
        if(dp[ind][target]!=-1)
            return dp[ind][target]==1;
        boolean notake=partition(nums,ind-1,target,dp);
        boolean take=false;
        if(nums[ind]<=target)
            take=partition(nums,ind-1,target-nums[ind],dp);
        dp[ind][target]=take||notake?1:0;
        return notake||take;
    }
}