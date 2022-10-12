class Solution {
    public int mySqrt(int x) {
        if(x==1)
            return(1);
        
        long s=0,e=x/2;
        long val=0;
        while(s<=e)
        {
            long m=s+(e-s)/2;
            if(m*m<=x)
            {
                val=m;
                s=m+1;
            }
            else
                e=m-1;
                
        }
        return((int)val);
        
        
        
    }
}