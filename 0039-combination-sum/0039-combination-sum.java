class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backtrack(res,new ArrayList<Integer>(),candidates,0,target);
        return res;
    }
    public void backtrack(List<List<Integer>>res,ArrayList<Integer>list,int[]arr,int index,int sum)
    {
        if(sum==0)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            if(sum-arr[i]>=0)
            {
                list.add(arr[i]);
                backtrack(res,list,arr,i,sum-arr[i]);
                list.remove(list.size()-1);
            }
        }
    }
}