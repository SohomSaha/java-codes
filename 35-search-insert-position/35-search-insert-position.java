class Solution {
    public int searchInsert(int[] nums, int target) {
        int r=0;int l=nums.length-1;
        int mid=(r+l)/2;
        while(r<=l)
        {
            if(nums[mid]<target)
                r=mid+1;
            else if(nums[mid]==target)
                return mid;
            else
                l=mid-1;
            mid=(r+l)/2;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>target)
                return i;
        }
            return nums.length;
    }
}