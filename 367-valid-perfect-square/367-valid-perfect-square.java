class Solution {
    public boolean isPerfectSquare(int a) {
        
        if(a==1)
            return(true);
        long s=1;
        long e=a;
        
        while(s<=e)
        {
          long  m=s+(e-s)/2;
             
            if(m*m==a)
                return(true);
            else if(m*m>a)
                e=m-1;
            else
                s=m+1;
            
        }
        return(false);
    }
}