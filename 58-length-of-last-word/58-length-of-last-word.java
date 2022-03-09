class Solution {
    public int lengthOfLastWord(String s) {
      if(s.trim().lastIndexOf(" ")>0)
        return (s.substring(s.trim().lastIndexOf(" "),s.trim().length())).length()-1;
        else
            return s.trim().length();
    }
}