class Solution {
    public int numUniqueEmails(String[] emails) {
        HashMap<String,HashSet<String>>map=new HashMap<>();
        int len=0;
        for(String s:emails)
        {
            int index=s.indexOf('@');
            String local=filter(s.substring(0,index));
            String domain=s.substring(index+1,s.length());
            if(map.containsKey(domain))
             map.get(domain).add(local); 
           else 
            map.put(domain,new HashSet<String>(Arrays.asList(local)));
        }
        for(HashSet<String> set:map.values())
            len+=set.size();
        return len;      
    }
    public String filter (String s)
    {
        String res="";
        for(char c:s.toCharArray())
        {
            if(c=='+')
                break;
            else if(c!='.')
                res=res+c;
        }
        return res;
    }
}