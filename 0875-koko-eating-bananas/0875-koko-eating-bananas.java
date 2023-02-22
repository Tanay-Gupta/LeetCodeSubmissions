class Solution {
    public int time(int a[],int k)
    {
        int  s=0;
        for(int i=0;i<a.length;i++)
        {
            s=s+(int)Math.ceil(a[i]/(k*1.0));
             //System.out.println(" time: "+s);
            
        }
      //System.out.println(" sum"+s);
        return(s);
        
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        
        
        
        int s=0,e=Arrays.stream(piles).max().getAsInt();
        int speed=0;
        while(s<=e)
        {
            int m=s+(e-s)/2;
           //ystem.out.print(m);
            int x=time(piles,m);
            if(x<=h)
            {
             speed=m;
                e=m-1;   
            }
                
            else
            {
               s=m+1; 
            }
                
         
        }
        return(speed);
    }
}
