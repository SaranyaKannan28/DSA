class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int arr[]=new int[2];
        int k=0;
        for(Map.Entry<Integer,Integer> ob : map.entrySet()){
            if(ob.getValue()==1){
                arr[k++]=ob.getKey();
            }
        }
        return arr;
    }
}