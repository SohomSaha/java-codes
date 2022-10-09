class Solution {
    public boolean isPalindrome(String s) {
     int start=0,end=s.length()-1;
        s=s.toLowerCase();
        
        while(start<end)
        {
            if(!Character.isLetter(s.charAt(start))&&!Character.isDigit(s.charAt(start)))
                start++;
            else if(!Character.isLetter(s.charAt(end))&&!Character.isDigit(s.charAt(end)))
                end--;
            else
            {
                if(s.charAt(start)!=s.charAt(end))
                    return false;
                start++;
                end--;
            }
        }
        return true;
    }
}