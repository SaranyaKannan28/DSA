class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];
        int res[] = getGreater(nums2); 
        for(int i=0;i<nums1.length;i++){
            int j=0;
            while(nums1[i]!=nums2[j]){
                j++;
            }
            int val = res[j];
            arr[i]=val;
        }
           return arr; 
    }

        public static int[] getGreater(int []nums2){
            Deque<Integer> st = new ArrayDeque<>();
            int n=nums2.length;
            int res[] = new int[n];
            st.push(nums2[n - 1]);
            res[n-1] = -1;
            for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
               st.pop();
            }
            res[i]=st.isEmpty()?-1:st.peek();
            st.push(nums2[i]);
           }
           return res;
        }
}