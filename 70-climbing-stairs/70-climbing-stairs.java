class Solution {
    public int climbStairs(int n) {
         int dp[]=new int[n+1];
        return stairs(n,dp);
    }
    private int stairs(int n,int []dp)
    {
        if(n<=1)
            return 1;
        if(dp[n]!=0)
            return dp[n];
        return dp[n]=stairs(n-1,dp)+stairs(n-2,dp);
    }
}