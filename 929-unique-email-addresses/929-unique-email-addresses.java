class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String>set=new HashSet<String>(emails.length);
        for(String s:emails)
            set.add(filter(s));
        return set.size();
    }
    public String filter(String s)
    {
        String res="";
        for(char c:s.toCharArray())
        {
            if(c=='+'||c=='@')
                break;
            if(c!='.')
                res=res+c;
        }
        return res+s.substring(s.indexOf('@'),s.length());
    }
}