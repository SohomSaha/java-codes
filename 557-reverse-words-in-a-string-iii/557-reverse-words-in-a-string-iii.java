class Solution {
    public String reverseWords(String s) {
        String []words=s.split(" ");
        String res="";
        for(String word:words)
        {
           int n=word.length()-1;
            while(n!=-1)
                res=res+word.charAt(n--);
            res=res+" ";
        }
        return res.trim();
    }
}