class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        //finding pivot
        int i,j;
        for(i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
                break;
        }
        if(i<0)//if pivot not found
        {
            reverse(nums,0,n-1);
            return;
        }
        for(j=n-1;j>i;j--)//finding rightmost successor
        {
            if(nums[j]>nums[i])
                break;
        }
        swap(nums,i,j);//swapping
        reverse(nums,i+1,n-1);//reversing the suffix
    }
    public static void reverse(int[]nums,int a,int b)
    {
        while(a<b)
        {
            swap(nums,a,b);
            a++;b--;
        }
    }
    public static void swap(int[]nums,int a,int b)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}