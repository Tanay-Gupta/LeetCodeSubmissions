class Solution {
    public int partitionString(String s) {
   
        
        int c=1;
        int max=(int)-1e9;
        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(h.contains(ch))
            {
                c++;
                h=new HashSet<>();
            }
            
                h.add(ch);
        }
        
        return c;
        
    }
}