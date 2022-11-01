class Solution {
    
    public long sum(long n)
    {
        long s=0;
        while(n>0)
        {
            s+=n%10;
            n=n/10;
        }
        return(s);
    }
    public long makeIntegerBeautiful(long n, int target) {
        
        long k=0;
        long x=1;
        while(sum(n)>target)
        {
            k=k+x*(10-n%10);
            n=n/10+1;
            x*=10;
        }
        return(k);
        
        
        
        
    }
}