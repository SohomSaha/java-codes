class Solution {
    public boolean anagcheck(String s1,String s2) 
    {
        if(s1.length()!=s2.length())
            return false;
        int[] visited=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            visited[(int)(s1.charAt(i)-'a')]+=1;
            visited[(int)(s2.charAt(i)-'a')]-=1;
        }
        for(int i:visited)
        {
            if(i!=0)
                return false;
        }
        return true;
    }
    public List<String> removeAnagrams(String[] words) {
        List<String>list=new ArrayList<>();
        list.add(words[0]);
        for(int i=1;i<words.length;i++)
        {  
            if(!anagcheck(words[i],words[i-1]))   
                list.add(words[i]);
        }
        return list;
    }
}