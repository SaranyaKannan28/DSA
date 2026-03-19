class Solution {
    public boolean detectCapitalUse(String word) {
        boolean val = check(word);
		return val;
	}
	public static boolean check(String s){
	    s=s.trim();
	    if(lowercase(s) || uppercase(s) || mixed(s)){
	        return true;
	    }
	    return false;
	}
	
	public static boolean lowercase(String s){
	    
	    for(int i=0;i<s.length();i++){
	        if(!Character.isLowerCase(s.charAt(i))){
	            return false;
	        }
	    }
	    return true;
	}
	public static boolean uppercase(String s){
	    
	    for(int i=0;i<s.length();i++){
	        if(!Character.isUpperCase(s.charAt(i))){
	            return false;
	        }
	    }
	    return true;
	}
	
	public static boolean mixed(String s){
	    
	    int i=0;
	    
	    if(!Character.isUpperCase(s.charAt(i))){
	        return false;
	    }
	    i++;
	    for(;i<s.length();i++){
	        if(!Character.isLowerCase(s.charAt(i))){
	            return false;
	        }
	    }
	    return true;
	}
}