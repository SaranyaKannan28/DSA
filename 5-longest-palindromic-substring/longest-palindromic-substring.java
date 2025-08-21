class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1)return s;
        int maxlength=1;
        String maxstr = s.substring(0,1);

        for(int i=0;i<s.length();i++){
            for(int j=i+maxlength;j<=s.length();j++){
                if(j-i>1 && IsPalindrome(s.substring(i,j))){
                    maxlength = j-i;
                    maxstr = s.substring(i,j);
                }
            }
        }
        return maxstr;
    }

        public static boolean IsPalindrome(String s){
            int e = s.length()-1;
            int f=0;
            while(f<=e){
                if(s.charAt(f)!=s.charAt(e)){
                    return false;
                }
                f++;
                e--;
            }
            return true;
        
    }
}