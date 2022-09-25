class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int l1=s.length();
        int l2=t.length();
        if(l1!=l2)
            return(false);
        
        
        HashMap<Character,Character> h=new HashMap<>();
        int i;
        for(i=0;i<l1;i++)
        {
            if(h.containsKey(s.charAt(i)))
               {
                   if(h.get(s.charAt(i))!=t.charAt(i))
                       return(false);
                
               }
            else if(h.containsValue(t.charAt(i)))
                return(false);
        
               else
               h.put(s.charAt(i),t.charAt(i));
        }
               return(true);
            
        
    }
}