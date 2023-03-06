import java.util.*;
class Solution {
    
    
    public String isNumber(String s,int d)
    {
        try {
        double v = Long.parseLong(s);
            v=v-(v*d/100.00);
          
          String  ss=String.format("%.2f",v);
            
                return ss;
    
   
} catch (NumberFormatException e) {
 return s;
}
        
    }
    public String discountPrices(String sentence, int discount) {
        
        
        StringTokenizer str=new StringTokenizer(sentence);
        String ns="";
        while(str.hasMoreTokens())
        {
            String s=str.nextToken();
            if(s.charAt(0)=='$')
            {
                ns=ns+"$"+isNumber(s.substring(1,s.length()),discount)+" ";
            }
            else
            ns=ns+s+" ";
            
        }
        return ns.trim();
        
    }
}