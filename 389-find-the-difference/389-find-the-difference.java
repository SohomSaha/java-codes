class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0;
        for(int i=0;i<t.length();i++)
        {
            if(i!=s.length())
            sum1+=(t.charAt(i)-s.charAt(i));
           else
            sum1+=t.charAt(i);
        }
        return (char)(sum1);
    }
}