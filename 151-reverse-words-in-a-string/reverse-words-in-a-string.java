class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split("\s+");
        StringBuilder word = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            word.append(arr[i]).append(" ");
        }
        return word.toString().trim();
    }
}