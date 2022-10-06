class Solution {
    public int minCost(String colors, int[] time) {
       // PriorityQueue<Integer>queue=new PriorityQueue<Integer>();
        int t=0,max=0;
        for(int i=0;i<time.length-1;i++)
        {
            if(colors.charAt(i)==colors.charAt(i+1))
            {
                t+=time[i];
                max=Math.max(max,time[i]);
                max=Math.max(max,time[i+1]);
            }
            else
            {
                t+=time[i];
                max=Math.max(max,time[i]);
                t-=max;
                max=0;
            }
            System.out.println(t);
        }
        if(max!=0)
        {
            t+=time[time.length-1];
            t-=max;
        }
        return t;
    }
}