class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length==0)
            return(0);
        Arrays.sort(g);
        Arrays.sort(s);
    
        int j=0;
        int count=0;
        for(int i=0;i<g.length;)
        {
            if(s[j]>=g[i])
            {
                count++;
                i++;
                
            }j++;
            if(j==s.length)break;
            
        }
        return(count);
            
    }
}