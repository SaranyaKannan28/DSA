class Solution {
    public int singleNumber(int[] nums) {
        boolean counted[] = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(counted[i]) continue;
            int count =1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    counted[j]=true;
                }
            }
            if(count==1) return nums[i];
        }
        return -1;
    }
}