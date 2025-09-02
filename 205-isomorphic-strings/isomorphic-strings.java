class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> ob1 = new HashMap<>();
        HashMap<Character,Character> ob2 = new HashMap<>();

        if(s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++){
            if(ob1.containsKey(s.charAt(i))){
                if(ob1.get(s.charAt(i))!=(t.charAt(i))) return false;
            }
            else{
                ob1.put(s.charAt(i),t.charAt(i));
            }
            if(ob2.containsKey(t.charAt(i))){
                if(ob2.get(t.charAt(i))!=(s.charAt(i))) return false;
            }
            else{
                ob2.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}