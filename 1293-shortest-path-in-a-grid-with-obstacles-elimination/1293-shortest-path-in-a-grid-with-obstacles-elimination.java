class Solution {
    int[][] dir = new int[][]{{0,1},{0,-1},{-1,0},{1,0}};
    public int shortestPath(int[][] grid, int k) {
        int m = grid.length;
        if(m==0) {
            return 0;
        }
        int n = grid[0].length;
        int[][] obstacleThatCanBeEliminated = new int[m][n]; // Number of obstacles that can be eliminated.
        boolean[][] visited = new boolean[m][n];// Check if the index has been visited.
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0,k});// x,y,obstacleCount
        obstacleThatCanBeEliminated[0][0]=k; // Initially we can eliminate k obstacles.
        int step=1;
        while(!queue.isEmpty()) {
            int size=queue.size();
            for(int i=0;i<size;i++) {
                int[] poll = queue.poll();
                if(poll[0]==m-1 && poll[1]==n-1) {
                    return step-1;
                }
                int currentObstacleCount = poll[2];
                for(int[] d : dir) {
                    int nextX = poll[0]+d[0];
                    int nextY = poll[1]+d[1];
                    if(nextX>=0 && nextY>=0 && nextX<m && nextY<n && 
					/*Add the next element to the queue if it has not been visited yet or it has
                    been visited but the number of obstacles encountered are greater than the current path, 
                    hence we can replace it with the current path.*/
                            (obstacleThatCanBeEliminated[nextX][nextY]<currentObstacleCount || !visited[nextX][nextY])
                            && (grid[nextX][nextY]==0 || (grid[nextX][nextY]==1 && currentObstacleCount>0))
                        /*currentObstacleCount>0 it means the current obstacle can also be eliminated*/) {
                        if(grid[nextX][nextY]==1) {
                            queue.add(new int[]{nextX,nextY,currentObstacleCount-1});
                            obstacleThatCanBeEliminated[nextX][nextY]=currentObstacleCount-1;
                        } else {
                            queue.add(new int[]{nextX,nextY,currentObstacleCount});
                            obstacleThatCanBeEliminated[nextX][nextY]=currentObstacleCount;
                        }
                        visited[nextX][nextY]=true;
                    }
                }
            }
            step++;
        }
        return -1;
    }
}