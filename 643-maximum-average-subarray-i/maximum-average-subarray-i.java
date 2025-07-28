class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxavg = Integer.MIN_VALUE;
        double sum=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            if(k==r-l+1){
                double avg = sum/k;
                maxavg=Math.max(avg,maxavg);
                sum=sum-nums[l];
                l++;
            }
        }
        return maxavg;


        
    }
}