class Solution {
    public boolean judgeSquareSum(int c) {
        
                long s=0;
        long e=(long)Math.sqrt(c);
        
        while(s<=e)
        {
            long m=s*s+e*e;
            if(m==(long)c)
                return(true);
            else if(m<(long)c)
                s=s+1;
            else
                e=e-1;
            
        }
        return(false);
        
    }
}