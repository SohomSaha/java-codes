class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        return Math.max(robber(nums,nums.length-2,0),robber(nums,nums.length-1,1));
    }
     public int robber(int[] nums,int ind,int t)
    {
       int prev2=0,prev1=nums[t],curr=0;
        for(int i=1+t;i<=ind;i++){
            curr=Math.max(nums[i]+prev2,0+prev1);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}