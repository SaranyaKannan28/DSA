class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> obj1 = new ArrayList<>();
        List<Character> obj2 = new ArrayList<>();


        for(char c : s.toCharArray()){
            obj1.add(c);
        }
        Collections.sort(obj1);

        for(char c : t.toCharArray()){
            obj2.add(c);
        }
        Collections.sort(obj2);

        boolean val = obj1.equals(obj2);

        return val;

        
    }
}