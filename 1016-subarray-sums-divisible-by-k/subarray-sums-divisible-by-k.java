class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,1);
        int prefixsum=0;
        int count=0;
        for(int i:nums){
              prefixsum+=i;

              int remain = prefixsum%k;
              if(remain<0) remain= remain+k;

              if(hmap.containsKey(remain)){
                count+=hmap.get(remain);
              }

              hmap.put(remain,hmap.getOrDefault(remain,0)+1);
        }
        return count;
    }
}