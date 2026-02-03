class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int high = 0;
       

        for(int i:weights){
            max=Math.max(i,max);
            high+=i;
        }
         int ans = high;
         int low = max;

        while(low<=high){
            int mid = low + (high-low)/2;

            int countdays = finddays(mid,weights);

            if(countdays<=days){
                   ans = mid;
                   high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return ans;
    }

    public int finddays(int mid , int[] arr){
        int day=1;
        int load=0;

        for(int i:arr){

            if(load+i>mid){
                day++;
                load=i;
            }
            else{
                load+=i;
            }
        }
        return day;
    }
}