class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)
            return false;
        double ans=Math.log(n)/Math.log(4);
        return Math.floor(ans)==ans;
    }
}