class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,1);
        int count=0;
        int prefixsum=0;

        for(int i:nums){
             prefixsum+=i;
 
             if(hmap.containsKey(prefixsum-goal)){

                count+=hmap.get(prefixsum-goal);
             }

             hmap.put(prefixsum,hmap.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}