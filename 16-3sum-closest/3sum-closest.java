class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right= nums.length-1;

            while(left<right){
                int sum= nums[left]+nums[right]+nums[i];
                if(Math.abs(sum-target)<=Math.abs(result-target)) {
                result = sum;}
                if(sum == target) return sum;
                else if(sum<target) left++;
                else right--;
            }
        }
        return result;
    }
}