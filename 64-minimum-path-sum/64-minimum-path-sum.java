import java.util.*;
class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][]dp=new int[m][n];
        for(int i=0;i<m;i++)
            Arrays.fill(dp[i],-1);
        return path(grid,m-1,n-1,dp);
    }
    public int path(int[][] grid,int m,int n,int[][]dp)
    {
        if(m==0&&n==0)
            return dp[m][n]=grid[m][n];
        if(dp[m][n]!=-1)
            return dp[m][n];
        int up=Integer.MAX_VALUE,left=Integer.MAX_VALUE;
        if(m>0)
         up=grid[m][n]+path(grid,m-1,n,dp);
        if(n>0)
         left=grid[m][n]+path(grid,m,n-1,dp);
        return dp[m][n]=Math.min(up,left);
    }
}