class Solution {
    public int[] numberOfPairs(int[] nums) {
       HashSet<Integer>set=new HashSet<Integer>(nums.length);
       int same=0;
        for(int i:nums)
        {
            if(set.contains(i))
            {same++;set.remove(i);}
            else
                set.add(i);
        }
        return new int[]{same,set.size()};
    }
}