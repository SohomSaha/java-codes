class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int[][]dp=new int[m][n];
        int res=0;
        for(int i=0;i<n;i++)
        {
            dp[0][i]=nums1[0]==nums2[i]?1:0;
            res=Math.max(res,dp[0][i]);
        }
        for(int i=0;i<m;i++)
        {   
            dp[i][0]=nums1[i]==nums2[0]?1:0;
            res=Math.max(res,dp[i][0]);
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(nums1[i]!=nums2[j])
                    continue;
                dp[i][j]=dp[i-1][j-1]+1;
                res=Math.max(dp[i][j],res);
            }    
        }
        return res;
    }
}