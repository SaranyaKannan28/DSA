class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int result[] = new int[n];
        int low =0 ;
        int high = n-1;

        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                result[low++]=nums[i];
            }
            if(nums[n-i-1]>pivot){
                result[high--]=nums[n-i-1];
            }
        }
        while(low<=high){
            result[low++]=pivot;
        }
        return result;

        }
    }