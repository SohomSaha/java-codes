class Solution {
    public String reverseWords(String s) {
        String []words=s.split(" ");
        String res="";
        for(String word:words)
        {
            Stack<Character>stack=new Stack<>();
            for(char c:word.toCharArray())
                stack.push(c);
            while(!stack.isEmpty())
                res=res+stack.pop();
            res=res+" ";
        }
        return res.trim();
    }
}