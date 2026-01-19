class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low =1;
        int high = Integer.MIN_VALUE;

        for(int i:nums){
            high = Math.max(i,high);
        }

        int ans=-1;

        while(low<=high){

            int mid = low+(high-low)/2;

            int val = divisonfun(nums,mid);

            if(val<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;
}

 public static int divisonfun(int []nums,int mid){
    int sum=0;

    for(int i=0;i<nums.length;i++){
        sum+=Math.ceil((double)nums[i]/mid);
    }
     return sum;
   }
}