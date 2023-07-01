class Solution {
    public int threeSumClosest(int[] a, int t) {
        
        
        
        
//         int i,j,k;
//         int m=(int)1e9;
//         int c=0;
//         for(i=0;i<a.length-2;i++)
//         {
//             for(j=i+1;j<a.length-1;j++)
//             {
//                 for(k=j+1;k<a.length;k++)
//                 {
//                     if(i!=j&&j!=k&&k!=i)
//                     {
                        
//                             int s=a[i]+a[j]+a[k];
//                             if(Math.abs(s-t)<m)
//                             {
//                                 m=Math.abs(s-t);
//                                 c=s;
//                             }
//                     }
//                 }
//             }
//         }
//         return c;
        
        
    
        Arrays.sort(a);
        int i,j,k;
                int m=(int)1e9;
        int c=0;
        for(i=0;i<a.length-2;i++)
        {
            
            j=i+1;
            k=a.length-1;
            
            while(j<k)
            {
                int s=a[i]+a[j]+a[k];
                if(s==t)
                    return t;
               else if(s<t)
                    j++;
                else
                    k--;
                    
                    
                if(Math.abs(s-t)<m)
                            {
                                m=Math.abs(s-t);
                                c=s;
                            }    
            }
        
        }
        return c;
        
    }
}