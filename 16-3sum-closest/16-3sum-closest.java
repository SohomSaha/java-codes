class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest=0;
        Arrays.sort(nums);
        for(int i=0,n=nums.length,mindiff=Integer.MAX_VALUE;i<n-2;i++)
        {
            for(int j=i+1,k=n-1;j<k;)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target)
                    return sum;
                if(sum<target)
                    j++;
                else
                    k--;
                int diff=Math.abs(sum-target);
                if(diff<mindiff)
                {
                    mindiff=diff;
                    closest=sum;
                }     
            }
        }
        return closest;
    }
}