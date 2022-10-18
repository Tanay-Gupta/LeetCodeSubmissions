class Solution {
    public int[] twoSum(int[] a, int t) {
        
        int s=0,e=a.length-1;
        int b[]=new int[2];
        
        while(s<=e)
        {
           
            
            if(a[s]+a[e]==t)
            {
                b[0]=s+1;
                b[1]=e+1;
                break;
                
            }
            else   if(a[s]+a[e]>t)
                e=e-1;
            else
                s=s+1;
        }
        return(b);
        
    }
}