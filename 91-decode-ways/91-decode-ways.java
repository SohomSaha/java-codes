import java.util.*;
class Solution {
    public int numDecodings(String s) {
        int dp[]=new int[s.length()+1];
        Arrays.fill(dp,-1);
       return s.length()==0?0:decode(0,s.toCharArray(),dp);
    }
    public int decode(int ind,char arr[],int[]dp)
    {
        int n=arr.length;
        if(ind==n)
            return 1;
        if(arr[ind]=='0')
            return 0;
        if(dp[ind]!=-1)
            return dp[ind];
        int res=decode(ind+1,arr,dp);
        if(ind<n-1&&(arr[ind]=='1'||(arr[ind]=='2'&&arr[ind+1]<'7')))
            res+=decode(ind+2,arr,dp);
        return dp[ind]=res;
    }
}