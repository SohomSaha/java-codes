class Solution {
    public boolean checkIfPangram(String s) {
        HashSet<Character>set=new HashSet<>();
        for(char c:s.toCharArray())
            set.add(c);
        return set.size()==26;
    }
}