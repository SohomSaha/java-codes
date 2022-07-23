class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>map=new HashMap<>();
        char key;
        for(int i=0;i<s.length();i++)
        {
             if(!map.containsKey(s.charAt(i))&& map.containsValue(t.charAt(i)))
                 return false;
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),t.charAt(i));
            else
            {

                if(map.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
        }
        return true;
    }
}