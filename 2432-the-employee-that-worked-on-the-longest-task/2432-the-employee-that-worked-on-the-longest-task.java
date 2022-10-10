class Solution {
    public int hardestWorker(int n, int[][] log) {
        int maxi=-1,maxt=0;
        for(int i=0;i<log.length;i++)
        {
            if(i==0)
            {
                maxt=log[i][1];
                maxi=log[i][0];
                continue;
            }
            if(maxt<=log[i][1]-log[i-1][1])
            {
                if(maxt==log[i][1]-log[i-1][1])
                    maxi=Math.min(maxi,log[i][0]);
                else
                    maxi=log[i][0];
                 maxt=log[i][1]-log[i-1][1];
            }
        }
        return maxi;
    }
}