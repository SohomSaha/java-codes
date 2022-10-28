class Solution {
    public int jump(int[] nums) {
        int[]dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return nextjump(nums,0,dp);
    }
    public int nextjump(int[]nums,int ind,int[]dp)
    {
        if(ind>=nums.length-1)
            return 0;
        if(nums[ind]==0)
            return (int)Math.pow(10,7);
        if(dp[ind]!=-1)
            return dp[ind];
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=nums[ind];i++)
        {
            int next=1+nextjump(nums,ind+i,dp);
            min=Math.min(next,min);
        }
        return dp[ind]=min;
    }
}