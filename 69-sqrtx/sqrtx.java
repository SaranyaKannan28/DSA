class Solution {
    public int mySqrt(int x) {
        int high = x;
        int low =1;
        if(x==0||x==1) return x;

        while(low<=high){
            int mid = low+(high-low)/2;
            if((long)mid*mid>x){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return high;
    }
}