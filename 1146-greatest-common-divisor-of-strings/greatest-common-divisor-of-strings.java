class Solution {
    public String gcdOfStrings(String str1, String str2) {

        if(!(str1+str2).equals(str2+str1)) return "";
        
        int a=str1.length();
        int b=str2.length();

        while(b!=0){
            int temp = a%b;
            a=b;
            b=temp;
        }

        return str2.substring(0,a);
        
    }
}