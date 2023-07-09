class Solution {
    public int trap(int[] a) {
        
        
        
        int n=a.length;
        int lmax[]=new int[n];
        lmax[0]=a[0];
       for(int i=1;i<n;i++)
           lmax[i]=Math.max(a[i],lmax[i-1]);
         
        int rmax[]=new int[n];
         rmax[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--)
             rmax[i]=Math.max(a[i],rmax[i+1]);
        
        
        
        int s=0;
        
        for(int i=1;i<n-1;i++)
        {
            s+=Math.min(lmax[i],rmax[i])-a[i];
        }
        return s;
    }
}