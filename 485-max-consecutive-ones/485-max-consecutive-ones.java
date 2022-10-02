class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,max=0;
        for(int i:nums)
        {
            if(i==0)
            {
                max=max>count?max:count;
                count=0;
            }
            else
                count++;
           // System.out.println(count);
        }
        return max>count?max:count;
    }
}