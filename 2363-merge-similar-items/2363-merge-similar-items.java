import java.util.*;
class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int[]items:items1)
            map.put(items[0],items[1]);
        for(int []items:items2)
            map.put(items[0],map.getOrDefault(items[0],0)+items[1]);
        List<List<Integer>> list= new ArrayList<List<Integer>>(map.size());
        int j=0;
       int []arr=new int[map.size()];
        for(int i:map.keySet())
            arr[j++]=i;
        Arrays.sort(arr);
       for(int i=0;i<map.size();i++)
            list.add(new ArrayList<Integer>(Arrays.asList(arr[i],map.get(arr[i]))));
        return list;
    }
}