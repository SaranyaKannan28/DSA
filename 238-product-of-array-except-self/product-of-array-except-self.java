class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        Arrays.fill(arr,1);

        int prefix=1;
        for(int i=0;i<n;i++){
            arr[i]=prefix;
            prefix=nums[i]*prefix;
        }

        int suffix=1;
        for(int i=n-1;i>=0;i--){
            arr[i]=suffix*arr[i];
            suffix=nums[i]*suffix;
        }
         return arr;
    }
}