class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> obj = new ArrayList<>();
        int n = nums.length;
        int max = n/3;
        boolean visited[] = new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]) continue;
            int count = 1;
            visited[i]=true;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                    visited[j]=true;
                }
            }
            if(count>max){
                obj.add(nums[i]);
            }
        }
        return obj;
    }
}