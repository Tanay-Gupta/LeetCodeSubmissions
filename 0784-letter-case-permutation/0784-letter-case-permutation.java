class Solution {
    public List<String> letterCasePermutation(String s) {
        
        
        
        int l=s.length();
        Set<String> list=new HashSet<>();
        for(int i=0;i<(int)Math.pow(2,l);i++)
        {
            
            String ns="";
            for(int j=0;j<l;j++)
            {
                char ch=s.charAt(j);
                if((i&(1<<j))!=0)
                {
                    
                    if(ch>='a'&&ch<='z')
                        ch-=32;
                    else if(ch>='A'&&ch<='Z')
                        ch+=32;
                    
                    
                }
                ns=ns+ch;
            }
            list.add(ns);
            
        }
        List<String> ar=new ArrayList<>(list);
        return ar;
        
    }
}