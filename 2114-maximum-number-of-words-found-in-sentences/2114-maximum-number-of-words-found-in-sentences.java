class Solution {
    public int mostWordsFound(String[] sentences) 
    {
        int max=0;
        for(int i=0;i<sentences.length;i++)
        {
            String[] words=sentences[i].split(" ");
            max=Math.max(words.length,max);
        }
        return max;
    }
}