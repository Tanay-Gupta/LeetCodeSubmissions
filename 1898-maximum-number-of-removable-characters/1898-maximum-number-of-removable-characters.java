class Solution {
    public int maximumRemovals(String s, String p, int[] a) {
        
        
        
        int ss=0,e=a.length;
        int map[]=new int[s.length()];
        Arrays.fill(map,a.length);
        for(int i=0;i<a.length;++i)
            map[a[i]]=i;
            
        
        

        while(ss<e)
        {
            int m=(ss+e+1)/2;
            int j=0;
            for(int i=0;i<s.length()&&j<p.length();++i)
            {
                if(map[i]>=m&&s.charAt(i)==p.charAt(j))
                ++j;
            }
            
        
            if(j==p.length())
            {
                ss=m;
            }
            else
                e=m-1;
        }
        return ss;
        
        
        
        
    }
}