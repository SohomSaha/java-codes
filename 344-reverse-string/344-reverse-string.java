class Solution {
       int n=-1;
    public void reverseString(char[] s) {
        if(++n==(s.length/2))
            return;
        char temp=s[n];
        s[n]= s[s.length-n-1];
        s[s.length-n-1]=temp;
        reverseString(s);
    }
}