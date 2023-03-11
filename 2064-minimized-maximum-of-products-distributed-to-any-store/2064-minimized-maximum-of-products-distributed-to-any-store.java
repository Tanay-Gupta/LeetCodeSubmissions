class Solution {
    public int minimizedMaximum(int n, int[] a) {
        
        
        
        
        Arrays.sort(a);
        int s=1;
        int e=a[a.length-1];
        
        
        while(s<e)
        {
           
            
            int m=s+(e-s)/2;
            int sum=0;
            int sum1=0;
            for(int i:a)
            {
//               sum1+=(i+m-1)/m;
                sum+=Math.ceil((double)i/m);
            }
            
            
            if(sum>n)
                s=m+1;
            else
                e=m;
        }
        return s;
        
    }
}