class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int l=0,count=0;
        int r=0;
        int sum=0;

        for(r=0;r<arr.length;r++){
                sum+=arr[r];

                if(k==r-l+1){
                    int avg=(sum/k);
                    if(avg>=threshold){
                        count++;

                    }
                    sum=sum-arr[l];
                    l++;   
                    }
        }
         return count;
    }
}