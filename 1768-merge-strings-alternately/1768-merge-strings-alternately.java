class Solution {
    public String mergeAlternately(String a, String b) {
        
        
        
        
     StringBuffer ns=new StringBuffer();
        
        int i=0,j=0;
        while(i<a.length()&&j<b.length())
        {
            ns.append(a.charAt(i));
            ns.append(b.charAt(j));
            i++;
            j++;
            
        }
        while(i<a.length())
        {
            ns.append(a.charAt(i));
           
            i++;
            
        }
        while(j<b.length())
        {
           
            ns.append(b.charAt(j));
            j++;
            
        }
        return ns.toString();
    }
}