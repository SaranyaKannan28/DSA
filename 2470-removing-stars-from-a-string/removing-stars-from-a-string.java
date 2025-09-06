class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for(char a : s.toCharArray()){
            if(a=='*'){
               sb.setLength(sb.length()-1);
            }
            else{
                sb.append(a);
            }
        }
       return  sb.toString();
    }
}