class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer>row=new ArrayList<>();
        List<Integer>col=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i=0;i<row.size();i++)
        {
            int r=row.get(i);
            int c=col.get(i);
            for(int a=0;a<n;a++)
                matrix[r][a]=0;
            for(int a=0;a<m;a++)
                matrix[a][c]=0;
        }
    }
}