class Solution {
    int [][]dp=new int[32][1002];
    int mod=(int)Math.pow(10,9)+7;
    public int numRollsToTarget(int n, int k, int target) {
        for(int []i:dp)
            Arrays.fill(i,-1);
        return solve(n,k,target);
    }
    public int solve(int n,int k,int target)
    {
        if(n==0&&target==0)
                return 1;
        if(n<0||target<0)
            return 0;
        if(dp[n][target]!=-1)
            return dp[n][target];
        int sum=0;
        for(int i=1;i<=k;i++)
            sum=((sum%mod)+solve(n-1,k,target-i)%mod)%mod;
        return dp[n][target]=sum;
    }
}