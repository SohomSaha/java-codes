class Solution {
    public int[] findErrorNums(int[] nums) {
        int []arr=new int[nums.length+1];
        int res[]=new int[2];
        for(int i:nums)
        {
            if(arr[i]==1)
                res[0]=i;
            else
                arr[i]=1;
        }
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==0)
                res[1]=i;
        }
        return res;
    }
}