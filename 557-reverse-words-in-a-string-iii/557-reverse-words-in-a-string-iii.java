import java.util.*;
class Solution {
    public String reverseWords(String s) {
        
                
        
        StringTokenizer str=new StringTokenizer(s);
        
        int i;
        String ns="";
        String nns="";
        while(str.hasMoreTokens())
        {
            
            String ss=str.nextToken();
            ns="";
            for(i=ss.length()-1;i>=0;i--)
            {
                ns=ns+ss.charAt(i);
            }
            nns=nns+ns+" ";
        }
        return(nns.trim());
        
        
    }
}