class Solution {
    public double myPow(double x, int n) {
     long m =n;
      if(m>=0){
        return( Math.pow(x,m));
      } 
      else{
        return (1.0/(Math.pow(x,-m)));
      } 
    }
}