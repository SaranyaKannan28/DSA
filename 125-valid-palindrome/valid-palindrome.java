class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        
        boolean val = palindrome(s,0);
        return val;
    }
    public static boolean palindrome(String S,int i){
        int n = S.length();
        

        if(i>=n/2){
            return true;
        }

        if(S.charAt(i)!=S.charAt(n-i-1)) return false;
        return palindrome(S,i+1);
    }
}