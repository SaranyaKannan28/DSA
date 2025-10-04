class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for(char x : s.toCharArray()){
            if(!s1.isEmpty() && x=='#'){
                s1.pop();
            }
            else{
                if(Character.isLetter(x)){
                    s1.push(x);
                }
            }
        }
        for(char x : t.toCharArray()){
            if(!s2.isEmpty() && x=='#'){
                s2.pop();
            }
            else{
                if(Character.isLetter(x)){
                    s2.push(x);
                }
            }
        }
        if(s1.size()!=s2.size()) return false;
        while(!s1.isEmpty() && !s2.isEmpty()){
            if(s1.pop()!=s2.pop()){
                return false;
            }
        }
        return true;
    
    }
}