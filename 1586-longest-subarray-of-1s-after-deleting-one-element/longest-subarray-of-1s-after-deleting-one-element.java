class Solution {
    public int longestSubarray(int[] nums) {
        int zerocount=0;
        int maxvalue=0;
        int left=0 , right=0;
        for(;right<nums.length;right++){
            if(nums[right]==0){
                zerocount++;
            }
            while(zerocount>1){
                if(nums[left]==0){
                    zerocount--;
                }
                left++;
            }
            maxvalue=Math.max(maxvalue,right-left+1-zerocount);
        }
         return (maxvalue==nums.length) ? maxvalue-1:maxvalue;
    }
}