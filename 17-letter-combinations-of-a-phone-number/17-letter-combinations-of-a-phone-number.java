class Solution {
     List<String>l=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String[]>map=new HashMap<>();
        map.put('2',"abc".split(""));
        map.put('3',"def".split(""));
        map.put('4',"ghi".split(""));
        map.put('5',"jkl".split(""));
        map.put('6',"mno".split(""));
        map.put('7',"pqrs".split(""));
        map.put('8',"tuv".split(""));
        map.put('9',"wxyz".split(""));
      if(digits.length()==0)
            return l;
        
        help(map,digits,"",0);
        return l;
    }
    
    public void help(HashMap<Character,String []> map, String s, String prev,int i)
    {
        if(prev.length()==s.length())
        {
            l.add(prev);
            return;
        }
        //System.out.println(map.get(s.charAt(i)));
        for(int x = 0; x<map.get(s.charAt(i)).length; x++)
        {
            help(map,s,prev+map.get(s.charAt(i))[x],i+1);
        }
        
    }
}