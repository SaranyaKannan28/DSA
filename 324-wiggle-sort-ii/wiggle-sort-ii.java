class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int arrsort[]=nums.clone();
        Arrays.sort(arrsort);

        int l = (n-1)/2;
        int r = n-1;

        for(int i=0;i<arrsort.length;i++){
            if(i%2==0){
                nums[i]=arrsort[l];
                l--;
            }
            else{
                nums[i]=arrsort[r];
                r--;
            }
        }
    }
}