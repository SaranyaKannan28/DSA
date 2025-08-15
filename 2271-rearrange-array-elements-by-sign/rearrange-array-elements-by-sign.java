class Solution {
    public int[] rearrangeArray(int[] nums) {
        List <Integer> pos = new ArrayList<>();
        List <Integer> neg = new ArrayList<>();
        List <Integer> res = new ArrayList<>();

        for(int num :nums){
            if(num>0){
                pos.add(num);
            }
            else if(num<0){
                neg.add(num);
            }
        }
        int i=0;

        while(i<pos.size()){
            res.add(pos.get(i));
            res.add(neg.get(i));
            i++;
        }

        int result [] = new int [res.size()];
        for(int k=0;k<res.size();k++){
            result[k]=res.get(k);
        }
        return result;

        
    }
}