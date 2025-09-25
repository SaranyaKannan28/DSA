class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n = findsquare(n);
        }
        return (n==1)? true : false;
    }
    public static int findsquare(int n){
        int sum=0;
        while(n!=0){
            int digit = n%10;
            sum+= digit*digit;
            n=n/10;
        }
        return sum;
    }
   
}