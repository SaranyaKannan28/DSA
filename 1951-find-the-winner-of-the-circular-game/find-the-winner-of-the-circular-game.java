class Solution {
    public int findTheWinner(int n, int k) {
        if (k==2){
            int high2power = Integer.highestOneBit(n);
            int iter = n-high2power;
            int sur = iter*2+1;
            return sur;
        }
        int res = 0;
        for(int i=2;i<=n;i++){
            res= (res+k)%i;
        }
        return res+1;
        
    }
}