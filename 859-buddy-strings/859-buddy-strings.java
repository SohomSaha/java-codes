class Solution {    
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length())
            return false;

        if (A.equals(B)) {
            Set set = new HashSet();
            for (int i = 0; i < A.length(); i++) {
                if (set.contains(A.charAt(i)))
                    return true;
                else set.add(A.charAt(i));
            }
            return false;
        }
    int count=0;
        char c1=' ',c2=' ';
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)!=B.charAt(i))
            {
                if(count==0)
                {
                    c1=A.charAt(i);
                    c2=B.charAt(i);
                }
                else if(c1!=B.charAt(i)||c2!=A.charAt(i))
                    return false;
                count++;
            }
        }
        if(count!=2)
            return false;
        return true;
        
    }
}