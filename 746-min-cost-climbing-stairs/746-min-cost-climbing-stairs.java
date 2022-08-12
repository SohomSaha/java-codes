class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int ind=cost.length;
        int prev2=0;
        int prev1=0;
        int curr=0;
        for(int i=2;i<=ind;i++) {      
        int left=cost[i-2]+prev2;
        int right=cost[i-1]+prev1;
        curr=Math.min(left,right);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
}
}