//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int w, int wt[], int val[], int n) 
    { 
        //Memoization
     /*   int[][]dp=new int[n+1][w+1];
        for(int i[]:dp)
            Arrays.fill(i,0);
        return knapsack(w,wt,val,n,dp);    
    }
    static int knapsack(int w,int wt[],int val[],int n)
    {
        if(n==0||w==0)
            return 0;
        if(dp[n][w]!=0)
            return dp[n][w];
        if(wt[n-1]<=w)
            return dp[n][w]=Math.max(val[n-1]+knapsack(w-wt[n-1],wt,val,n-1),knapsack(w,wt,val,n-1));
        else
            return dp[n][w]=knapsack(w,wt,val,n-1);  
    }*/
    //top-down approach
    /*    int[][]dp=new int[n+1][w+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=w;j++)
            {
                if(i==0||j==0)
                    dp[i][j]=0;
                else if(wt[i-1]<=j)
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                else
                    dp[i][j]=dp[i-1][j];
            }
        }*/
    //space-optimised    
        int [][]dp=new int[2][w+1];
        int i=0;
        while(i<n)
        {
            int j=0;
            if(i%2!=0)
            {
                while(++j<=w)
                {
                    if(wt[i]<=j)
                        dp[1][j]=Math.max(val[i]+dp[0][j-wt[i]],dp[0][j]);
                    else 
                        dp[1][j]=dp[0][j];
                }
            }
            else
            {
                while(++j<=w)
                {
                    if(wt[i]<=j)
                        dp[0][j]=Math.max(val[i]+dp[1][j-wt[i]],dp[1][j]);
                    else
                        dp[0][j]=dp[1][j];
                }
            }
            i++;
        }
        return (n%2!=0)?dp[0][w]:dp[1][w];
    }
}


