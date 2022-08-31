class Solution {
    public int strStr(String haystack, String needle) {
        StringBuilder sb=new StringBuilder(0);
        if(needle.length()>haystack.length())
            return -1;
         int l=needle.length(),i=0;
        while(l--!=0)
            sb.append(haystack.charAt(i++));
        int j=0;
        while(true)
        {
            if(sb.toString().equals(needle))
                return j;
            if(i==haystack.length())
                return -1;
            sb.delete(0,1);
            sb.append(haystack.charAt(i));
            i++;
            j++;
        }
    }
}