class Solution {
    public String breakPalindrome(String s) {
        
    int l=s.length();
        if(l==1)
            return("");
        int k=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
          
            if(ch[i]!='a'&&i!=l/2)
            {
                ch[i]='a';
                k=1;
                return(String.valueOf(ch));
            }
        }
        if(k==0)
        {
            ch[l-1]++;
              return(String.valueOf(ch));
        }
        return("");
    }
}