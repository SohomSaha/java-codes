import java.util.*;
class Solution {
    public int[] findErrorNums(int[] nums) {
    int[]res=new int[2];
    boolean []visited=new boolean[nums.length];    
        for(int i:nums)
        {
            if(visited[i-1]==true)
                res[0]=i;
            else
                visited[i-1]=true;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!visited[i]) res[1]=i+1 ;
        }
          return res;  
    }
}