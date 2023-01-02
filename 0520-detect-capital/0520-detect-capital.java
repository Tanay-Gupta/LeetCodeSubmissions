class Solution {
    public boolean detectCapitalUse(String word) {
    
        if(word.toUpperCase().compareTo(word)==0)
            return(true);
        
        if(word.toLowerCase().compareTo(word)==0)
            return(true);
        
        if(Character.isUpperCase(word.charAt(0))&&(word.substring(1,word.length()).toLowerCase().compareTo(word.substring(1,word.length()))==0))
            return(true);
        
        
        return(false);
        
        
    }
}