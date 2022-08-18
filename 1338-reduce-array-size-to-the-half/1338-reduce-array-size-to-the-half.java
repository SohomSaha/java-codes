import java.util.*;
class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>(arr.length);
        for(int i:arr)
            map.put(i,map.getOrDefault(i,0)+1);
        int length=arr.length;
        int value[]=new int[map.size()];
        int set=0;
        for(int i:map.values())
            value[set++]=i;
        Arrays.sort(value);
        set=0;
        int sum=0;
        for(int i=value.length-1;i>=0;i--)
        {
            if(sum>=length/2)
                break;
            sum+=value[i];
            set++;
        }
        return set;
    }
}