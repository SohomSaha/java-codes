class Solution {
    public int rob(int[] nums) {
        return robber(nums,nums.length-1);
    }
    public int robber(int[] nums,int ind)
    {
       int prev2=0,prev1=nums[0],curr=0;
        for(int i=1;i<=ind;i++){
           int pick=nums[i]+prev2; 
        int nopick=0+prev1;
            curr=Math.max(pick,nopick);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}