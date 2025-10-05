class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int count =0;
        int left =0;
        long prod =1;
        for(int right=0;right<nums.length;right++){
            prod = prod* nums[right];

            while(left<=right && prod>=k){
                prod = prod/nums[left];
                left++;
            }

            count+= right-left+1;
        }

        return count;
    }
}