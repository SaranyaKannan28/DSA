class Solution {
    public int addDigits(int num) {
        List<Integer> ob = new ArrayList<>();
        if(num<10) return num;
        while(num>9){
            ob.clear();
            int sum=0;
            while(num!=0){
                int digit = num%10;
                ob.add(digit);
                num=num/10;
            }
            for(int i=0;i<ob.size();i++){
                sum+=ob.get(i);
            }
            num=sum;
        };
        return num;
        
    }
}