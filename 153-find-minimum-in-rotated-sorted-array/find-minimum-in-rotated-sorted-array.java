class Solution {
    public int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int low=0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[low]<=arr[mid]){
                for(int i=low;i<=mid;i++){
                    min=Math.min(arr[i],min);
                }
                low=mid+1;
            }
            else{
                for(int i=mid;i<=high;i++){
                    min=Math.min(arr[i],min);
                }
                high=mid-1;
            }
        }
        return min;
    }
}