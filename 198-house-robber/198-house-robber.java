class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        return robber(nums,nums.length-1,dp);
    }
    public int robber(int[] nums,int ind,int[] dp)
    {
        dp[0]=nums[0];
        for(int i=1;i<=ind;i++){
           int pick=nums[i]; 
            if(i>1)
            pick+=dp[i-2];
        int nopick=0+dp[i-1];
            dp[i]=Math.max(pick,nopick);
        }
        return dp[ind];
    }
}