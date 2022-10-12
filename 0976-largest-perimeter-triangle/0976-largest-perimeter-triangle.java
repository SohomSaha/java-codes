import java.util.*;
class Solution {
    public int largestPerimeter(int[] nums) {
        int l1,l2,l3,n=nums.length-1,c=n-3;
        Arrays.sort(nums);
        l1=nums[n];
        l2=nums[n-1];
        l3=nums[n-2];
        while(l1>=l2+l3)
        {
            if(c<0)
                return 0;
            l1=l2;
            l2=l3;
            l3=nums[c];
            c--;
        }
        return l1+l2+l3;
    }
}