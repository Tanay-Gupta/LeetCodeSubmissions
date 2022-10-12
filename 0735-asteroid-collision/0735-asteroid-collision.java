class Solution {
    
    public boolean isOpposite(int a,int b)
    {
        if((a<0&&b>=0)||(a>=0&&b<0))
            return(true);
        else
            return(false);
    }
    public int[] asteroidCollision(int[] a) {
        
        Stack<Integer> s=new Stack<Integer>();
        
        s.add(a[0]);
        for(int i=1;i<a.length;i++)
        {
             int k=0;
          while(!s.isEmpty()&&s.peek()>=0&&a[i]<0)
           {
             
               if(Math.abs(s.peek())<Math.abs(a[i]))
                   s.pop();
               else if(Math.abs(s.peek())==Math.abs(a[i]))
               {
                   s.pop();
                   k=1;
                   break;
               }
               else
               {
                   k=1;break;
               }
           }
            if(k==0)
           s.add(a[i]); 
            
        }
        int b[]=new int[s.size()];
        
        for(int i=s.size()-1;i>=0;i--)
            b[i]=s.pop();
        return(b);
        
        
        
    }
}