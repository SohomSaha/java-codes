class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length, res = 0;
        
        int[][] dp = new int[m+1][n+1];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums1[i] != nums2[j]) continue;
                dp[i+1][j+1] = dp[i][j] + 1;
                res = Math.max(res, dp[i+1][j+1]);
            }
        }
        
        return res;
    }
}