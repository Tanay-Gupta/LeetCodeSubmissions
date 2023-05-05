class Solution {
    public int maxVowels(String s, int k) {
        
        int c=0,mx=0;
        String ns="aeiou";
        for(int i=0;i<k;i++)
        {
            if(ns.indexOf(s.charAt(i))!=-1)
                c++;
            
        }
        
        mx=Math.max(mx,c);
        
        
        for(int i=k;i<s.length();i++)
        {
            if(ns.indexOf(s.charAt(i-k))!=-1)
                c--;
             if(ns.indexOf(s.charAt(i))!=-1)
                c++;
             mx=Math.max(mx,c);
            
            
        }
        return mx;
    }
}