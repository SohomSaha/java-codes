import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,l=0;
        while(j<n)
        {
            if(i>=m)
             nums1[i]=nums2[j++];
        else if(nums1[i]>nums2[j])
        {
            int temp=nums1[i];
            nums1[i]=nums2[j];
            nums2[j]=temp;
            Arrays.sort(nums2);
        }
            i++;
        }
    }
}