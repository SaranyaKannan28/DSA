class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        for(int row=0;row<r;row++){
            for(int col=0;col<c;col++){
                if(grid[row][col]=='1'){
                    countisland(row,col,r,c,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public static void countisland(int row,int col,int row_size,int col_size,char mat[][]){
        if(row<0||col<0||row>=row_size||col>=col_size||mat[row][col]!='1'){
            return;
        }
        else{
            mat[row][col]='2';
            countisland( row-1, col, row_size,col_size,mat);
            countisland( row+1, col, row_size,col_size,mat);
            countisland( row, col+1, row_size,col_size,mat);
            countisland( row, col-1, row_size,col_size,mat);  
        }
    }
}