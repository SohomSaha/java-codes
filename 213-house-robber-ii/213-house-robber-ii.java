class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
       /* ArrayList<Integer>list=new ArrayList<>();
        for(int i:nums)
            list.add(i);
        list.remove(0);*/
         int pick=robber(nums,nums.length-2,0);
        /*list.add(0,nums[0]);
        list.remove(nums.length-1);*/
        int nopick=robber(nums,nums.length-1,1);
        return Math.max(pick,nopick);
    }
     public int robber(int[] nums,int ind,int t)
    {
       int prev2=0,prev1=nums[t],curr=0;
        for(int i=1+t;i<=ind;i++){
           int pick=nums[i]+prev2; 
        int nopick=0+prev1;
            curr=Math.max(pick,nopick);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}