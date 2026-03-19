class Solution {
    public int numSub(String s) {
        int count =0;
        long res =0;
        long mod = 1000000007;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
            else{
                res= (res+(long)count*(count+1)/2)%mod;
                count=0;
            }
        }
         res= (res+(long)count*(count+1)/2)%mod;
         return (int)res;
    }
}