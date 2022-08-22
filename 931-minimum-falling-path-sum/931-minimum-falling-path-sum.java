class Solution {
    static int dp[][];
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        dp=new int[n][n];
        for(int i=0;i<n;i++)
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
            min=Math.min(min,path(matrix,n-1,n-1-i));
        return min;
    }
    public int path(int[][]matrix,int i,int j)
    {
        if(i==0)
            return dp[i][j]=matrix[i][j];
        if(dp[i][j]!=Integer.MAX_VALUE)
            return dp[i][j];
        int up=matrix[i][j]+path(matrix,i-1,j);
        int left=Integer.MAX_VALUE,right=Integer.MAX_VALUE;
        if(j<matrix.length-1)
            right=matrix[i][j]+path(matrix,i-1,j+1);
        if(j>0)
            left=matrix[i][j]+path(matrix,i-1,j-1);
        return dp[i][j]=Math.min(Math.min(up,left),right);
    }
}