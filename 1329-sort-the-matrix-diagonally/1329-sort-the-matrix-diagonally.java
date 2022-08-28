class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer, PriorityQueue<Integer>> hm = new HashMap<>();
        for(int i = 0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                PriorityQueue<Integer> pq = hm.getOrDefault(i-j, new PriorityQueue<>());
                pq.add(mat[i][j]);
                hm.put(i-j, pq);
            }
        }
        
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                mat[i][j] = hm.get(i-j).poll();
            }
        }
        
        return mat;
    }
}