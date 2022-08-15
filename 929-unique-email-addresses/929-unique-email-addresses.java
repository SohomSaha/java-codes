class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String>set=new HashSet<String>(emails.length);
        for(String s:emails)
            set.add(filter(s));
        return set.size();
    }
    public String filter(String s)
    {
        String word="";
        int a=0,b=0;
        for(a=0;a<s.length();a++)
        {
             if(s.charAt(a)=='@')
                break;
            if(s.charAt(a)=='+')
                b=1;
            if(s.charAt(a)!='.'&&b==0)
                word=word+s.charAt(a);
        }
        return word+s.substring(a,s.length());
    }
}