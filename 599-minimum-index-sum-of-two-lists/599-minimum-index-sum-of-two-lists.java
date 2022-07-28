class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer>map=new HashMap<>();
        List<String>list=new ArrayList<>();
        int sum=2000;
        for(int i=0;i<list1.length;i++)
            map.put(list1[i],i);
        for(int i=0;i<list2.length;i++)
        {
            if(map.containsKey(list2[i]))
            {
                int in=i+map.get(list2[i]);
                if(sum>in)
                {
                    list=new ArrayList();
                    sum=in;
                }
                if(sum==in)
                    list.add(list2[i]);
            }
        }        
       return list.toArray(new String[0]);     
    }
}