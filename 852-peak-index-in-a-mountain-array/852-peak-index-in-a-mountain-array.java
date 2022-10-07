class Solution {
    public int peakIndexInMountainArray(int[] a) {
        
       int s=0;
       int e=a.length-1; 
        while(s<e)
        {
            int m=s+(e-s)/2;

            if(a[m]<a[m+1])
                s=m+1;
            else
                e=m;
            
        }
        return(s);
    }
}