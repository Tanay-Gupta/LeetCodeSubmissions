class Solution {
    public boolean searchMatrix(int[][] a, int t) {
        
        
        int m=a.length;
        int n=a[0].length;
        int i=0;
        for( i=0;i<m;i++)
        {
            if(t<=a[i][n-1])
                break;
        }
        if(i==m)
            return(false);
        
        int s=0,e=n-1;
        while(s<=e)
        {
            int mm=s+(e-s)/2;
            if(a[i][mm]==t)
                return(true);
            else if(a[i][mm]>t)
                e=mm-1;
            else
                s=mm+1;
        }
        return(false);
        
    }
}