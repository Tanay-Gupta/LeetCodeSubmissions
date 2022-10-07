class Solution {
    public int[] searchRange(int[] a, int t) 
    {
        
        int s=0,e=a.length-1;
        int first=-1,last=-1;
        while(s<=e)
        {
            int m=s+(e-s)/2;  
            if(a[m]==t)
            {
                first=m;
                e=m-1;
            }
            else if(a[m]>t)
                e=m-1;
            else
                s=m+1;
            
        }
         s=0;e=a.length-1;
        while(s<=e)
        {
            int m=s+(e-s)/2;  
            if(a[m]==t)
            {
                last=m;
                s=m+1;
            }
            else if(a[m]>t)
                e=m-1;
            else
                s=m+1;
            
        }
     //   System.out.println(s+" "+e);
        return(new int[]{first,last});

        }
}