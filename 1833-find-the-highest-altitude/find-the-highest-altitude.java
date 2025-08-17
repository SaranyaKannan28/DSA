class Solution {
    public int largestAltitude(int[] gain) {
        int alti[] = new int[gain.length+1];
        alti[0]=0;
        int max = 0;
        for(int i=1;i<alti.length;i++){
            alti[i]= alti[i-1]+gain[i-1];
            max =Math.max(max,alti[i]);
        }
        return max;
    }
}