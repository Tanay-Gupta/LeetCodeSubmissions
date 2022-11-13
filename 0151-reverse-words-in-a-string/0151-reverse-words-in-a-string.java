import java.util.*;
class Solution {
    public String reverseWords(String s) {
        
        String ns="";
       StringTokenizer str=new StringTokenizer(s);
        while(str.hasMoreTokens())
        {
            ns=" "+str.nextToken()+ns;
        }
        ns=ns.trim();
        return(ns);
    }
}