class Solution {
    public void moveZeroes(int[] nums) {
        int ball=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                ball++;
            else if(ball!=0)
            {
                nums[i-ball]=nums[i];
                nums[i]=0;
            }
        }
    }
}