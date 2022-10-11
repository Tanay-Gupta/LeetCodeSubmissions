
class Solution {
    public int climb(int n,int a[])
    {
        if(n==0||n==1)
            return(1);
       if(a[n]!=-1)
           return(a[n]);
        else
            return(a[n]=climb(n-1,a)+climb(n-2,a));
    }
    public int climbStairs(int n) {
        
       int a[]=new int[n+1];
       Arrays.fill(a,-1);
        return(climb(n,a));
        
        
        
    }
}