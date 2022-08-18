import java.util.*;
class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>(arr.length);
        for(int i:arr)
            map.put(i,map.getOrDefault(i,0)+1);
        PriorityQueue<Integer>queue=new PriorityQueue<Integer>(Collections.reverseOrder());
        queue.addAll(map.values());
        int sum=0,set=0;
        while(sum<arr.length/2)
        {
            sum+=queue.poll();
            set++;
        }
        return set;
    }
}