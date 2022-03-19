class Solution {
    public int strStr(String haystack, String needle) {
       if(needle.length()==0)
           return 0;
        int l=needle.length();
        if(haystack.length()<l)
            return -1;
        int j=l;
        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.substring(i,j).equals(needle))
                return i;
            j++;
            if(j>haystack.length())
                break;
        }
        return -1;
    }
}