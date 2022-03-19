class Solution {
    public List<List<Integer>> fourSum(int[] nums, int t1){
        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        if(nums==null||nums.length==0)
            return res;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int t2=t1-nums[i]-nums[j];
                int front =j+1;
                int back=n-1;
                while(front<back)
                {
                  int two_sum=nums[front]+nums[back];
                    if(two_sum<t2)
                        ++front;
                    else if(two_sum>t2)
                        --back;
                    else
                    {
                        List<Integer>quad=new ArrayList();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[back]);
                        res.add(quad);
                        while(front<back&&nums[front]==quad.get(2))
                            front++;
                        while(front<back&&nums[back]==quad.get(3))
                            back--;
                    }     
                }
                while(j+1<n&&nums[j+1]==nums[j])++j;
            }
            while(i+1<n&&nums[i+1]==nums[i])++i;
        }
        return res;
    }
}