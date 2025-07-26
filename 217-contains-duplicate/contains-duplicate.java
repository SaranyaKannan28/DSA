class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> obj = new HashSet<>();

        for(int n: nums){
            if(obj.contains(n)){
                return true;
            }
            else{
                obj.add(n);
            }

        }
        return false;
    }
}