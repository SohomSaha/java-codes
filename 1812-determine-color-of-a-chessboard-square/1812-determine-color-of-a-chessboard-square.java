class Solution {
    public boolean squareIsWhite(String coordinates) {
        return ((int)(coordinates.charAt(0)-'a')+1+(int)(coordinates.charAt(1)-'0'))%2!=0;
    }
}