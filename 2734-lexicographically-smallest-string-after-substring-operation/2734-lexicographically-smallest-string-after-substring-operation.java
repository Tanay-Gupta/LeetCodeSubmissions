class Solution {
    public String smallestString(String s) {
        
        
        char ch[]=s.toCharArray();
        int i;
        for( i=0;i<s.length();i++)
        {
            if(ch[i]!='a')
                break;
        }
        int n=s.length();
        if(i==s.length())
        {
            ch[i-1]='z';
            return new String(ch);
        }
        for(;i<n;i++)
        {
            if(ch[i]=='a')
                break;
           ch[i]--; 
        }
        return new String(ch);
        
    }
}