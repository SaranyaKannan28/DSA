class Solution {
    public int[] movesToStamp(String stamp, String target) {
        char tchar[] = target.toCharArray();
        char schar[] = stamp.toCharArray();
        boolean visited[] = new boolean[target.length()];
        List<Integer> list = new ArrayList<>();
        int count=0;

        while(count!=target.length()){
            boolean CanChange= false;

            for(int i=0;i<=target.length()-stamp.length();i++){
                if(!visited[i] && CanChange(tchar,schar,i)){
                    count = CanReplace(tchar,schar,i,count);
                    visited[i]=true;
                    CanChange= true;
                    list.add(i);

                    if(count==target.length())
                    break;
                }
                
            }
            if(!CanChange){
                return new int[]{};
            }

        }

        int res[] = new int[list.size()];
        int k=list.size()-1;
        for(int n:list){
            res[k--]= n;
        }

        return res;
    }

    public static boolean CanChange(char tchar[],char schar[] , int pos){
        for(int i=0;i<schar.length;i++){
            if(tchar[i+pos]!='?' && tchar[i+pos]!=schar[i]) return false;
        }
        return true;
    }

    public static int CanReplace(char[] tchar,char[] schar,int pos,int count){
        for(int i=0;i<schar.length;i++){
            if(tchar[i+pos]!='?'){
                tchar[i+pos] ='?';
                count++;
            }
        }
        return count;

    }
}