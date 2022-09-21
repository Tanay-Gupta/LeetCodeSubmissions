class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(goal.length()!=s.length())
            return(false);
        if((goal+goal).indexOf(s)!=-1)
            return(true);
        else
            return(false);
            
        
    }
}