class Solution {
    public int maxArea(int[] a) {
      
        
      int s=0;
        int e=a.length-1;
        int ans=0;
        
     while(s<e)
     {
         
         ans=Math.max(ans,Math.min(a[s],a[e])*(e-s));
         if(a[s]<=a[e])
             s=s+1;
         else
             e=e-1;
         
     }
        return(ans);
    }
}