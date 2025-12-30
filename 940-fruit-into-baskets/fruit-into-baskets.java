class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int left =0;
        int maxlength=0;
        for(int right =0 ; right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while(map.size()>2){
                int count = map.get(fruits[left]);
                count--;
                if(count==0){
                    map.remove(fruits[left]);
                }
                else{
                    map.put(fruits[left],count);
                }
                left++;
            }
               maxlength=Math.max(right-left+1,maxlength);
        }
        return maxlength;
    }
}