class Solution {
    public int maxProduct(int[] arr) {
         int max = Integer.MIN_VALUE;
       int prefix =1;
       int suffix =1;
       int n = arr.length;
       
       for(int i=0;i<arr.length;i++){
           
           if(suffix ==0) suffix=1;
           if(prefix ==0) prefix=1;
           prefix *= arr[i];
           suffix *=arr[n-i-1];
           
           max = Math.max(max,Math.max(prefix,suffix));
       }
       
       return max;
    }
}