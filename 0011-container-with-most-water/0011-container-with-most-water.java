class Solution {
    public int maxArea(int[] a) {
      
        
      int s=0;
        int e=a.length-1;
        int ans=0;
        
     while(s<e)
     {
         
         ans=Math.max(ans,Math.min(a[s],a[e])*(e-s));
         if(a[s]<=a[e])
         {
              int hl = a[s];
               while(s < e && a[s] <= hl)
                s++;
         }
      
         else
         {
             int hr=a[e];
             while(s<e&&a[e]<=hr)
                 e--;
         }
            
     }
        return(ans);
    }
}