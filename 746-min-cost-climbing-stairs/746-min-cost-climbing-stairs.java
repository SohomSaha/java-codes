class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int []dp=new int[cost.length+1];
        return mincost(cost,cost.length,dp);
    }
    public int mincost(int[] cost,int ind,int[] dp)
    {
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<=ind;i++) {      
        int left=cost[i-2]+dp[i-2];
        int right=cost[i-1]+dp[i-1];
        dp[i]=Math.min(left,right);
        }
        return dp[ind];
    }
}