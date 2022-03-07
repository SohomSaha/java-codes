class Solution {
    public long minimalKSum(int[] nums, long k) {
        Arrays.sort(nums);
        long sum=(k*(k+1))/2;long l=k;System.out.println(sum);
        for(int i=0;i<nums.length;i++)
        {
            if(i!=0)
           {
            if(nums[i-1]==nums[i])
               continue;
           }
            if(nums[i]<=k)
            {      sum=sum-nums[i]+(++k);
            System.out.println(sum);}
            else 
                break;
        }
        return sum;
    }
}