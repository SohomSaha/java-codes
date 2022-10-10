class Solution {
    public String breakPalindrome(String p) {
        char[]ch=p.toCharArray();
        if(p.length()==1)
            return "";
        for(int i=0;i<ch.length/2;i++)
        {
            if(ch[i]!='a')
            {
                ch[i]='a';
                return String.valueOf(ch);
            }
        }
        ch[ch.length-1]='b';
        return String.valueOf(ch);
    }
}