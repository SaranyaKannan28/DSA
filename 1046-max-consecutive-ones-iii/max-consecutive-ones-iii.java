class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxcount =0;
        int left=0,zerocount=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
             zerocount++;
             }
            while(zerocount>k){
               if(nums[left]==0){
                zerocount--;
               }
               left++;
            }

            maxcount=Math.max(maxcount,r-left+1);
        }
        return maxcount;
    }
}