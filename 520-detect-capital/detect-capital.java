class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercount = 0;

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch>='A' && ch<='Z'){
                uppercount++;
            }
        }

        if(uppercount==word.length()) return true;
        else if(uppercount==0) return true;
        else if(uppercount==1 && Character.isUpperCase(word.charAt(0))) return true;
        else return false;
    }
}