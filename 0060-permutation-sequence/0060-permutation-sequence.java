class Solution {
    public String getPermutation(int n, int k) {
        
        
        int fact=1;
        String s="";
        for(int i=1;i<n;i++)
        {
            s=s+""+i;
            fact*=i;
        }
        
        s+=""+n;
        
        String ns="";
        k=k-1;
        while(true)
        {
            ns=ns+s.charAt(k/fact);
            s=s.replace(s.charAt(k/fact)+"","");
            if(s.length()==0) break;
            
            k=k%fact;
            fact=fact/s.length();
        }
        return ns;
    }
}