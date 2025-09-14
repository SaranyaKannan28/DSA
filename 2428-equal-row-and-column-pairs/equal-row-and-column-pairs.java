class Solution {
    public int equalPairs(int[][] grid) {
        int count =0;
        Map<String,Integer> map = new HashMap<>();
        for(int row[]: grid){
            String rows = Arrays.toString(row);
            map.put(rows,map.getOrDefault(rows,0)+1);
        }

        for(int j=0;j<grid[0].length;j++){
            int coln[] = new int[grid[0].length];
            for(int i=0;i<grid.length;i++){
                coln[i] = grid[i][j];
            }
            String col = Arrays.toString(coln);
            if(map.containsKey(col)){
                count+=map.get(col);
            }
        }
        return count;
    }
}