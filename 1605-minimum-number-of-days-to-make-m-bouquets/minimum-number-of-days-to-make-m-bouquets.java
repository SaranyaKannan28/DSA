class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low =Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int ans=-1;

        if((m*k)>bloomDay.length) return -1;

        for(int i:bloomDay){
            low=Math.min(low,i);
            high=Math.max(high,i);
        }
        
        while(low<=high){
             int mid = low+(high-low)/2;
             int val=find(bloomDay,mid,m,k);
             
              if(val>=m){
                ans=mid;
                high=mid-1;
             }
             else{
                low=mid+1;
             }
        }
        return ans;
    }

    public static int find(int[] arr,int mid,int m,int k){
        int count=0;
        int val=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                count++;
            }
            else{
                val+=(count/k);
                count=0;
            }
        }
        val+=(count/k);
        return val;

    }


}