class Solution {
    public int[] numberOfPairs(int[] nums) {
       Set<Integer>set=new HashSet<>(nums.length);
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