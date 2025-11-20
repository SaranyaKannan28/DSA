class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        Set<Integer> set =  new TreeSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i:arr){
            set.add(i);
        }
        
        for(int i=1;i<=n+1;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}