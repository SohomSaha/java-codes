class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length<2)
            return false;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int currsum=0;
        for(int i=0;i<nums.length;i++)
        {
            int rem=0;
            currsum+=nums[i];
            rem=currsum%k;
            if(map.containsKey(rem)&&(i-map.get(rem))>1)
                return true;
            map.putIfAbsent(rem,i);
        }
        return false;
    }
}