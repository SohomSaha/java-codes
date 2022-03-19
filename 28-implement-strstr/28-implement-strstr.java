class Solution {
    public int strStr(String haystack, String needle) {
       if(haystack==null)
           return 0;
        return haystack.indexOf(needle);
    }
}