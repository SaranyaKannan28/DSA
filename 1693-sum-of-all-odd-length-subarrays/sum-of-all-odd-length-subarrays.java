class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       if(arr.length==0) return 0;
       int res = fun(arr,1);
       return res; 
    }
    public static int fun(int[]arr,int k){
        int val=0;
        for(;k<=arr.length;k+=2){
            int sum=0;
            int left=0;
            for(int right=0;right<arr.length;right++){
                sum+=arr[right];
                if((right-left+1)==k){
                    val+=sum;
                    sum-=arr[left++];
                }
            }
        }
        return val;
    }
}