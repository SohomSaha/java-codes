class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>res=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            int sum;
            while(j<k)
            {
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0)
                    res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if(sum<0)
                    j++;
                else
                    k--;
            }
        }
        return new ArrayList<>(res);
    }
}