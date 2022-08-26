class Solution {
   public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        for(int end=0;end<=n-3;end++) {
            int[] c1 = coordinates[end];
            int[] c2 = coordinates[end+1];
            int[] c3 = coordinates[end+2];
            if(!isCollinear(c1[0],c1[1],c2[0],c2[1],c3[0],c3[1])) {
                return false;
            }
        }
        return true;
    }

    private boolean isCollinear(int x1, int y1, int x2,int y2, int x3, int y3) {
        int result = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return result==0;
    }

}