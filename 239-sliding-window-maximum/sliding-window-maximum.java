class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            while(!q.isEmpty()&& q.peekFirst()<=i-k){
                q.pollFirst();
            }
            while(!q.isEmpty()&& nums[q.peekLast()]<=nums[i]){
                q.pollLast();
            }

            q.addLast(i);

            if(i>=k-1){
                list.add(nums[q.peekFirst()]);
            }
        }

        int arr[] = new int[list.size()];
        int j=0;
        for(int i:list){
            arr[j++]=i;
        }

        return arr;
    }
}