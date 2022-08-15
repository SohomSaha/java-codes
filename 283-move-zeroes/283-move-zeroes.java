class Solution {
    public void moveZeroes(int[] nums) {
        int ball=0,check=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                ball++;
            }
            else if(ball!=0)
            {
                swap(ball,i,nums);
                check=0;
            }
        }
    }
    public void swap(int ball,int index,int []nums)
    {
        nums[index-ball]=nums[index];
        nums[index]=0;
    }
}