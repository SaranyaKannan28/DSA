class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        long result=0;
        int sign=1;
        int i=0;
        if(s.charAt(0)=='-'||s.charAt(0)=='+'){
          sign=(s.charAt(0)=='-')?-1:1;
        i++;
        }
        while(i<s.length()){
               if(s.charAt(i)<'0' || s.charAt(i)>'9') break;
               result = result*10+(s.charAt(i)-'0');
               if(sign*result>Integer.MAX_VALUE) return Integer.MAX_VALUE;
               if(sign*result<Integer.MIN_VALUE) return Integer.MIN_VALUE;
               i++;
        }
       return (int) (sign*result);
    }
}