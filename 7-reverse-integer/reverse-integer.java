class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
            int rem = x%10;
            int newrev=rev*10+rem;
            if((newrev-rem)/10!=rev) return 0;
            rev = newrev;
            x=x/10;
        }
        return  rev;
    }
}