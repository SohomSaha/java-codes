class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0,sum2=0;
        for(int i=0;i<t.length();i++)
        {
            if(i!=s.length())
                sum1=sum1+(s.charAt(i)-'a');
            sum2=sum2+(t.charAt(i)-'a');
        }
        return (char)((sum2-sum1)+'a');
    }
}