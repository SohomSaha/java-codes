/*class Solution {
    public String longestCommonPrefix(String[] str) {
       String s=" ",s1=" ";
 for(int i=0;i<str[0].length();i++)
 {
     for(int j=0;j<str[1].length();j++)
     { if(str[0].charAt[i] ==str[1].charAt[j]) 
         s=s+str[0].charAt[i];}
 }
 for(int i=0;i<s.length();i++)
 {
     for(int j=0;str[2].length();j++)
     {
     if(s.charAt[i]=str[2].charAt[j])
         s1+=s.charAt[i];
     }
 }
 return s1;           
         
    }
}*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String output = strs[0];
        
        for(int i = 1; i < strs.length; i++){
            output = compare(output, strs[i]); 
        }
        return output;
    }
    
    public String compare(String s1, String s2){
        int length = Math.min(s1.length(), s2.length());
        int i = 0;
        for( ; i < length; i++){
            if(s1.charAt(i) != s2.charAt(i)) break;
        }
        return s1.substring(0, i);
    }
}