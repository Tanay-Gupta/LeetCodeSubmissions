class Solution {
    
    
    public boolean divideAll(int a[],long m,long k)
    {
        long c=0;
        
        for(int i:a)
        {
            c=c+ i/m;
            if(c>=k)return true;
        }
        if(c>=k)
            return true;
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        
        
        long sum=0;
        for(int i:candies)
        {
            sum+=i;
            
        }
        sum=sum/k;
        if(sum==0)
            return 0;
        
        
        long s=1;
        long e=sum;
        long ans=0;
        while(s<=e)
        {
            
            long m=s+(e-s)/2;
            
            if(divideAll(candies,m,k)==false)
                e=m-1;
            else
            {
                ans=m;
                s=m+1;
            }
                
                
        }
        return (int)ans;
                  
    }
}