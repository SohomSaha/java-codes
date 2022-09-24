class Solution {
    public  List<List<Integer>> subsets(int[] num) {
        List<List<Integer>>templist=new ArrayList<List<Integer>>();
         subset(0,num,templist,new ArrayList<>());
        return templist;
    }
   public void subset(int ind,int[]num,List<List<Integer>>res,List<Integer>temp)
    {
        if(ind==num.length)
        {
            res.add(temp);
            return ;
        }
        //nopick
        subset(ind+1,num,res,new ArrayList<>(temp));
        //pick
        temp.add(num[ind]);
        subset(ind+1,num,res,new ArrayList<>(temp));
    }
}