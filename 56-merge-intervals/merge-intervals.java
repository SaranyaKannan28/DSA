class Solution {
    public int[][] merge(int[][] intervals) {
        List <int[]> list = new ArrayList<>();
        int n=intervals.length;

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int current[] = intervals[0];

        for(int i=1;i<n;i++){
            if(current[1]>=intervals[i][0]){
                current[1]=Math.max(current[1],intervals[i][1]);
            }
            else{
                list.add(current);
                current=intervals[i];
            }

        }
        list.add(current);
        int result [][] = new int [list.size()][2];
        for(int k=0;k<list.size();k++){
            result[k]=list.get(k);
        }
        return result;
    }
}