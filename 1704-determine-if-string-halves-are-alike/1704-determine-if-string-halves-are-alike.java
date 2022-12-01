class Solution {
    public boolean halvesAreAlike(String s) {
        
        
        String z="AEIOUaeiou";
        int c=0,cb=0;
        for(int i=0;i<s.length()/2;i++)
        {
            if(z.indexOf(s.charAt(i))!=-1)
                c++;
            
            if(z.indexOf(s.charAt(s.length()-i-1))!=-1)
                cb++;
        }
            
        
        
        return(c==cb);
        
    }
}