class Solution {
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>(nums.length);
        int max=0;
        for(int i:nums)
        {max= Math.max(max,i);
         map.put(i,map.getOrDefault(i,0)+1);}
        return delete(map,max);
    }
    public int delete(HashMap<Integer,Integer>map,int n)
    {
        int prev2=0,prev1=0,curr=0;
        for(int i=1;i<=n;i++)
        {
            curr=Math.max(prev2+map.getOrDefault(i,0)*i,0+prev1);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}