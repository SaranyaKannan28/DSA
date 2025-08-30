class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int high= r*c-1;
        int low =0;
        while(low<=high){
            int mid = low+(high-low)/2;
            int row = mid/c;
            int col = mid%c;
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]<target) low = mid+1;
            else if(matrix[row][col]>target) high = mid-1;
        }

      return false;
    }
}