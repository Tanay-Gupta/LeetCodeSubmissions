class Solution {
    
    public boolean isSame(int a[],int b[])
    {
        for(int i=0;i<26;i++)
            if(a[i]!=b[i])
                return(false);
        return(true);
    }
    public List<Integer> findAnagrams(String s, String p) {
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(s.length()<p.length())
            return(list);
        
        
        int f[]=new int[26];//for s
        int f2[]=new int[26];//for p
        int i;
        
        for(i=0;i<p.length();i++)
        {
            f[s.charAt(i)-'a']++;
            f2[p.charAt(i)-'a']++;
            
        }
        
        int plength=p.length();
        for(i=0;i<s.length()-plength;i++)
        {
            if(isSame(f,f2))
                list.add(i);
            f[s.charAt(i)-'a']--;
            f[s.charAt(i+plength)-'a']++;
            
        }
         if(isSame(f,f2))
                list.add(i);
        return(list);
    }
}