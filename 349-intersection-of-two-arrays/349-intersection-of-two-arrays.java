import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<Integer>();
        HashSet<Integer> set2=new HashSet<Integer>();
        int j=0;
        for(int i:nums1)
            set1.add(i);
        for(int i:nums2)
        {
            if(set1.contains(i))
                set2.add(i);
        }
         int[] array = new int[set2.size()];
      for (Integer i: set2) 
         array[j++] = (int)i;
        return array;
    }
}