class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set <Integer> obj = new HashSet<>();
        int n=grid.length;
        int a =0;
        int b=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(obj.contains(grid[i][j])){
                    a=grid[i][j];
                }
                obj.add(grid[i][j]);
            }
        }
        for(int i=1;i<=n*n;i++){
            if(!obj.contains(i)){
                b=i;
            }

        }
        return new int[]{a,b};
    }
}