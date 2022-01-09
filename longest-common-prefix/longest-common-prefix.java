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
