class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String []arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String>set=new HashSet<String>(words.length);
        for(String s:words)
        {
            StringBuilder sb = new StringBuilder();
            for ( int i = 0; i < s.length(); i++ ) 
                sb.append( arr[s.charAt(i)-'a'] );
            set.add(sb.toString());
        }
        return set.size();
    }
}