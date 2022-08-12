class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        ArrayList<Integer>list=new ArrayList<>();
        for(int i:nums)
            list.add(i);
        list.remove(0);
         int pick=robber(list,list.size()-1);
        list.add(0,nums[0]);
        list.remove(nums.length-1);
        int nopick=robber(list,list.size()-1);
        return Math.max(pick,nopick);
        
    }
     public int robber(ArrayList<Integer>nums,int ind)
    {
       int prev2=0,prev1=nums.get(0),curr=0;
        for(int i=1;i<=ind;i++){
           int pick=nums.get(i)+prev2; 
        int nopick=0+prev1;
            curr=Math.max(pick,nopick);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}