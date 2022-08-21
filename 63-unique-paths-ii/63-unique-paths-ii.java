import java.util.*;
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1||obstacleGrid[m-1][n-1]==1)
            return 0;
        int [][]dp=new int[m][n];
        for(int i=0;i<m;i++)
            Arrays.fill(dp[i],-1);
        return path(obstacleGrid,m-1,n-1,dp);
    }
    public int path(int[][] arr,int m,int n,int[][] dp)
    {
        if(m==0&&n==0)
            return dp[m][n]=1;
        if(m<0||n<0)
            return 0;
        if(arr[m][n]==1)
            return dp[m][n]=0;
        if(dp[m][n]!=-1)
            return dp[m][n];
        int up=path(arr,m-1,n,dp);
        int left=path(arr,m,n-1,dp);
        return dp[m][n]=up+left;
    }
}