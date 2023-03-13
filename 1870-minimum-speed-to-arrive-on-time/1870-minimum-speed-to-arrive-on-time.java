import java.util.*;
class Solution {
    
    public boolean check(int[] a, int m, double h){
    int n=a.length;
    double total=0;
    for(int i=0;i<n;i++){
         double timeTaken=0.0;
            if(i==n-1)
                timeTaken = (double)a[i]/m;
           else  
            timeTaken = Math.ceil(Math.max((double)a[i]/m, 1.0));
        total += (timeTaken);
    }
    return total<=h;
}
    public int minSpeedOnTime(int[] dist, double hour) {
        
        
        int max=(int)1e9;
        int s=1;
        int e= max;
        
        int ans=max;
        while(s<=e)
        {
            int m=s+(e-s)/2;
            
            
            if(check(dist,m,hour)==false)
                s=m+1;
            else
                {
                ans=Math.min(ans,m);
                e=m-1;
            }
        }
        return ans==max?-1:ans;
        
    }
}