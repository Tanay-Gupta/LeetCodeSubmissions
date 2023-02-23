class Solution {
    
      public int time(int a[],int c,int days)
    {
       int daysNeeded = 1, currentLoad = 0;
        for(int i=0;i<a.length;i++)
        {
           currentLoad += a[i];
            if (currentLoad > c) {
                daysNeeded++;
                currentLoad = a[i];
            }
            
        }
       
        return(daysNeeded);
        
        
    }
    public int splitArray(int[] weights, int days) {
        
        
          int e=Arrays.stream(weights).sum();
        int s=Arrays.stream(weights).max().getAsInt();
        while(s<=e)
        {
            int m=s+(e-s)/2;
            int totalTime=time(weights,m,days);
            if(totalTime<=days)
            {
                e=m-1;
            }
            else
            {
                s=m+1;
            }
        }
        return s;
        
        
        
        
    }
}