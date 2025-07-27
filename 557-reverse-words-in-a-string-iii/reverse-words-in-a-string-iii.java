class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        StringBuilder w = new StringBuilder();
        for( String word : arr){
            StringBuilder ob = new StringBuilder(word);
            ob.reverse();
            w.append(ob).append(" ");
        }
        return w.toString().trim();
    }
}