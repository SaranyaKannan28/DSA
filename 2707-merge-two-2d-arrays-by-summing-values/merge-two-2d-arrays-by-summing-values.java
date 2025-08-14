class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> res = new ArrayList<>();
        int n= nums1.length;
        int m=nums2.length;

        int i=0,j=0;

        while(i<n && j<m){
            if(nums1[i][0]==nums2[j][0]){
                res.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }
            else if(nums1[i][0]<nums2[j][0]){
                res.add(new int[]{nums1[i][0],nums1[i][1]});
                i++;
            }
            else if(nums2[j][0]<nums1[i][0]){
                res.add(new int[]{nums2[j][0],nums2[j][1]});
                j++;
            }
        }

        while(i<n){
             res.add(new int[]{nums1[i][0],nums1[i][1]});
             i++;
        }

        while(j<m){
             res.add(new int[]{nums2[j][0],nums2[j][1]});
             j++;
        }

        int resarr[][] = new int[res.size()][2];
        for(int k =0; k<res.size();k++){
            resarr[k]=res.get(k);
        }

        return resarr;
    }
}