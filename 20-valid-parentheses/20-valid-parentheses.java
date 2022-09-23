class Solution {
    
    
    public boolean isSame(char c,char d)
    {
        if(c=='{'&&d=='}')
            return(true);
        else if(c=='('&&d==')')
            return(true);
        else if(c=='['&&d==']')
            return(true);
        return(false);
    }
    public boolean isValid(String s) {
        if(s.length()==1)
            return(false);
        
        int l=s.length();
        ArrayDeque<Character> ar=new ArrayDeque<>();
        
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
           // System.out.println(ch);
            if(ch=='('||ch=='{'||ch=='[')
                ar.push(ch);
            else
            {
                if(ar.isEmpty())
                    return(false);
                if(!isSame(ar.pop(),ch))
                    return(false);
            }
        }
        if(ar.size()!=0)
            return(false);
        return(true);
        
    }
}