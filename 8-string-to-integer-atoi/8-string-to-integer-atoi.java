
import java.util.regex.*;
class Solution {
    public int myAtoi(String s) {
        
       Pattern p=Pattern.compile("^[-+]?[0-9]+");
        Matcher m=p.matcher(s.trim());
        String ss="0";
        if(m.find())
        {
            ss=m.group();
           // System.out.println(ss);
        }
        else
            return(0);
        
       
       double val=Double.valueOf(ss);
        if(val>Integer.MAX_VALUE)
        {
            return(Integer.MAX_VALUE);
        }
        else if(val<Integer.MIN_VALUE)
        {
            return(Integer.MIN_VALUE);
        }
        return((int)val);
            
        
    }
}