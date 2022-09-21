class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int []res=new int [queries.length];
        int sum=sumeven(nums);
        for(int i=0;i<queries.length;i++)
        {
            int ind=queries[i][1];
            if(nums[ind]%2==0)
                sum-=nums[ind];
            nums[ind]+=queries[i][0];
            if(nums[ind]%2==0)
                sum+=nums[ind];
            res[i]=sum;
        }
        return res;
    }
   public int sumeven(int[]nums)
   {
       int sum=0;
       for(int i:nums)
            sum=i%2==0?sum+i:sum;
       return sum;
   }
}