class Solution {
    public String mergeAlternately(String word1, String word2) {

        char arr1[] = word1.toCharArray();
        char arr2[] = word2.toCharArray();

        int i=0,j=0,k=0;
        char merged[]  = new char[arr1.length+arr2.length];

        while(i<arr1.length||j<arr2.length){
            if(i<arr1.length)merged[k++]=arr1[i++];
            if(j<arr2.length)merged[k++]=arr2[j++];
           
        }
        return new String(merged);
    }
}