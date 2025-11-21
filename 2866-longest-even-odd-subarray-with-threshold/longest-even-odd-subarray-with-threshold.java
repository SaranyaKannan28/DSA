class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int current =0;
        int max =0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>threshold) {
                current=0;
                continue;
            }

            if(current==0){
                if(nums[i]%2==0){
                   current=1;
                   max= Math.max(max,current);
                }
                continue;
            }
                if(nums[i]%2!=nums[i-1]%2){
                    current++;
                 
                }
                else{
                    if(nums[i]%2==0){
                        current = 1;
                    }
                    else{
                        current =0;
                    }
                }
                max = Math.max(current,max);
            }
             
        return max;
    }
}