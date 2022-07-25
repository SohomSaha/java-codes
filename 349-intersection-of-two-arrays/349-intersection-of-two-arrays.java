import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<Integer>();
        List<Integer> list=new ArrayList<Integer>();
        int j=0;
        for(int i=0;i<nums1.length;i++)
            set.add(nums1[i]);
        for(int i=0;i<nums2.length;i++)
        {
            if(set.contains(nums2[i]))
            {
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}