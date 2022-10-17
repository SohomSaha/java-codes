class Solution {
    public boolean checkIfPangram(String sentence) {
        int[]arr=new int[26];
        for(char c:sentence.toCharArray())
            arr[c-'a']=1;
        for(int i:arr)
            if(i==0)
                return false;
        return true;
    }
}