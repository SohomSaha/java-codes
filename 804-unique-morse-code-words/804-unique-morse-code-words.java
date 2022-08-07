class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String []arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String>set=new HashSet<String>(words.length);
        for(String s:words)
        {
            String sb="";
            for(char c:s.toCharArray())
                sb=sb+arr[(int)(c-'a')];  
            set.add(sb);
        }
        return set.size();
    }
}