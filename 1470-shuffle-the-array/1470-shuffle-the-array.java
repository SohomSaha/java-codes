class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []result=new int [nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
         result[i]=nums[j];
         result[++i]=nums[j+n];
            j++;
        }
        return result;
    }
}