class Solution {
    public int findMin(int[] a) {
        
        
        int s=0;
        int e=a.length-1;
        
        while(a[s]> a[e])
        {
            int m=s+(e-s)/2;
            if(a[m]<a[e])
                e=m;
            else
                s=s+1;
        }
        return(a[s]);
        
        
        
        
    }
}