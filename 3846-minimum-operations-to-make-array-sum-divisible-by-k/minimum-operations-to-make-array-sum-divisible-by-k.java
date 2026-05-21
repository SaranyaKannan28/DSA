class Solution {
    public int minOperations(int[] nums, int k) {
        int total = 0;
        for(int i:nums){
            total+=i;
        }
        return total%k;
    }
}