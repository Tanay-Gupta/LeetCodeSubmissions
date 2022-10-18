class Solution {
    public int search(int[] a, int t) {
        
        
        
        int s=0;
        int e=a.length-1;
        while(s<=e)
        {
            int m=s+(e-s)/2;
            
            if(a[m]==t)
                return(m);
            else if(a[s]<=a[m])
            {
                if(t>=a[s]&&t<a[m])
                    e=m-1;
                else
                    s=m+1;
            }
            else
            {
                if(t<=a[e]&&t>a[m])
                     s=m+1;
                else
                    e=m-1;
                
            }
        }
        return(-1);
        
    }
}