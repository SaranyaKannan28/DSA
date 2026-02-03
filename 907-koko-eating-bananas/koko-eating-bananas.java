class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low =1 ;
        int high = Integer.MIN_VALUE;
        int ans = piles.length;

        for(int i:piles){
            high=Math.max(i,high);
        } 

        while(low<=high){
            int mid = low+(high-low)/2;

            int value= Rate(piles,mid);
             if(value<=h){
                ans=mid;
                high=mid-1;
            } 
            else{
                low =mid+1;
            }

        }
        return ans;
    }

    public static int Rate(int []arr,int mid){
        int tot=0;

        for(int i:arr){
            tot+=Math.ceil((double)i/mid);
        }
        return tot;
    }
}