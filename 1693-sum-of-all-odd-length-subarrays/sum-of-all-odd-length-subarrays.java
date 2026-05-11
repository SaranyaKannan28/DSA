class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
           int count = (i+1)*(n-i);
           int totval =  (count+1)/2;
           total+= arr[i]*totval;
        }
        return total;
    }
}