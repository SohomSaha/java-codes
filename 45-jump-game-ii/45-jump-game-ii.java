class Solution {
    public int jump(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return jump2(nums,0,dp);
    }
    public int jump2(int[] nums,int ind,int []dp)
    {
        if(ind>=nums.length-1)
            return 0;
        if(dp[ind]!=-1)
            return dp[ind];
        int min=10001;
        for(int i=ind+1;i<=nums[ind]+ind;i++)
            min=Math.min(min,1+jump2(nums,i,dp));
        dp[ind]=min;
        return min;
    }
}