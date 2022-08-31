class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n=grid.length;
        int[][]dp=new int[n][n];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<grid.length;i++)
        {
            min=Math.min(minpath(grid,0,i,dp),min);
        }
        return min;
    }
    public int minpath(int[][]grid,int i,int j,int[][]dp)
    {
        if(i==grid.length-1)
            return dp[i][j]=grid[i][j];
        if(dp[i][j]!=0)
            return dp[i][j];
       int min=Integer.MAX_VALUE,sum=Integer.MAX_VALUE;
        for(int k=0;k<grid.length;k++)
        {
            if(k!=j)
            sum=grid[i][j]+minpath(grid,i+1,k,dp);
            min=Math.min(min,sum);
        }
        return dp[i][j]=min;
    }
}