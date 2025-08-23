class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new LinkedHashSet<>();
        for(int i:nums){
             set.add(i);
        }
        int longest =0;
        int streak=0;
        int current=0;
        for(int n:set){
           if(!set.contains(n-1)){
            current=n;
            streak=1;
           }
           while(set.contains(current+1)){
            current++;
            streak++;
           }

           longest = Math.max(longest,streak);
        }

           return longest;
    }
}