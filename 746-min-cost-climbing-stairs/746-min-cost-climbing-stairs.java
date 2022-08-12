class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int []dp=new int[cost.length+1];
        return mincost(cost,cost.length,dp);
    }
    public int mincost(int[] cost,int ind,int[] dp)
    {
        if(ind==0||ind==1)
            return 0;
        if(dp[ind]!=0)
            return dp[ind];
        int left=cost[ind-2]+mincost(cost,ind-2,dp);
        int right=cost[ind-1]+mincost(cost,ind-1,dp);
        return dp[ind]=Math.min(left,right);
    }
}