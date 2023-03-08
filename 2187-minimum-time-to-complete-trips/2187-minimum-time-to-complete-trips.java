class Solution {
    
    
    public long calu(int a[], long t)
    { 
        long sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=t/a[i];
        }
        return sum;
    }
    public long minimumTime(int[] a, int totalTrips) {
        
        long start=1;
        long end=(long)1e14;
        long m=end;
        while(start<=end)
        {
             m=start+(end-start)/2;
            
             if(calu(a,m)<totalTrips)
                start=m+1;
            else
                end=m-1;
                
        }
        return start;
            
        
    }
}