class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                if(haystack.length()-i>=needle.length())
                {
                if(needle.equals(haystack.substring(i,i+needle.length())))
                    return i;
                }
            }
        }
        return -1;
    }
}