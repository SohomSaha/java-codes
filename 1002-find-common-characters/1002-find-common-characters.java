class Solution {
    public List<String> commonChars(String[] words) {
       ArrayList<String> result=new ArrayList<>();
        for(char c='a';c<='z';c++)
        {
            int mincount=Integer.MAX_VALUE;
            for(String s:words)
            {
             int wordcount=0;   
                for(char curr_c:s.toCharArray())
                    if(curr_c==c)
                        wordcount++;
              mincount=Math.min(wordcount,mincount);  
            }
            for(int i=1;i<=mincount;i++)
                result.add(""+c);
        }
        return result;
    }
}