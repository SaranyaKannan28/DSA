class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> obj1 = new HashSet<>();
        HashSet<Integer> obj2 = new HashSet<>();

        for(int num : nums1) obj1.add(num);
        for(int num : nums2) obj2.add(num);

        List<Integer> ob1 = new ArrayList<>();
        List<Integer> ob2 = new ArrayList<>();


        for(int i:obj1){
        if(!obj2.contains(i)){
            ob1.add(i);
        }
        }
        for(int j:obj2){
        if(!obj1.contains(j)){
            ob2.add(j);
        }
        }

        List<List<Integer>> res = new ArrayList<>();
        res.add(ob1);
        res.add(ob2);

        return res;

        


        
    }
}