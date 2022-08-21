import java.util.*;
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][]dp=new int[triangle.size()][triangle.size()];
        for(int i=0;i<triangle.size();i++)
            Arrays.fill(dp[i],-1);
        return minpath(triangle,0,0,dp);
    }
    public int minpath(List<List<Integer>> triangle,int i,int j,int[][]dp)
    {
        if(i==triangle.size()-1)
            return dp[i][j]=triangle.get(i).get(j);
        if(dp[i][j]!=-1)
            return dp[i][j];
        int down=triangle.get(i).get(j)+minpath(triangle,i+1,j,dp);
        int dia=Integer.MAX_VALUE;
        if(j<=i)
            dia=triangle.get(i).get(j)+minpath(triangle,i+1,j+1,dp);
        return dp[i][j]=Math.min(down,dia);
    }
}