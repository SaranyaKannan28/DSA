class Solution {
    public int pivotIndex(int[] nums) {
        int rightsum =0;
        for(int n: nums){
             rightsum+=n;
        }
        int leftsum=0;

        for(int i=0;i<nums.length;i++){
            if(leftsum==(rightsum-(leftsum+nums[i]))){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}