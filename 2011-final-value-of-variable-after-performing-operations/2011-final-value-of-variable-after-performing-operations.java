class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(int i=0;i<operations.length;i++)
        {
            String s=operations[i];
            if(s.equals("X++"))
                X++;
            else if(s.equals("++X"))
                ++X;
            else if(s.equals("X--"))
                X--;
            else
                --X;
        }
        return X;
    }
}