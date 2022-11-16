class Solution {
    

    public int eraseOverlapIntervals(int[][] a) {
        
        
        
    Arrays.sort(a,(x,y)->Integer.compare(x[1],y[1]));   
        
        int i;
        int c=1;
        int end=a[0][1];

        for(i=1;i<a.length;i++)
        {
            if(end<=a[i][0])
            {
                c++;
                end=a[i][1];
                
            }
        }
       // System.out.println(c);
        return(a.length-c);
        
        
        
        
        
        
        
        
        
    }
}