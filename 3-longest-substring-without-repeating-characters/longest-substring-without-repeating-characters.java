class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxcount=0;
        int l=0;
        for(int r=0;r<s.length();r++){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                maxcount=Math.max(maxcount,r-l+1);
            }
            else{
                while(set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(s.charAt(r));
            }
        }
        return maxcount;
    }
}