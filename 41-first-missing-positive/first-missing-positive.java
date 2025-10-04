class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int m:nums){
            set.add(m);
        }
        for(int i=1;i<=n+1;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }

        int min=Integer.MAX_VALUE;
        for(int k:list){
             min = Math.min(k,min);
        }

        return min;
    }
}