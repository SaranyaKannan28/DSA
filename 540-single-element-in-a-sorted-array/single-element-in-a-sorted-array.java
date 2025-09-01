class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
           map.put(n,map.getOrDefault(n,0)+1);
        } 
        for(Map.Entry<Integer,Integer> ob:map.entrySet()){
            if(ob.getValue()==1){
                return ob.getKey();
            }
        }
        return -1;
    }
}