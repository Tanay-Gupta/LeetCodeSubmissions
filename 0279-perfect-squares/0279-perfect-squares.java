class Solution {
    int dp[][];
    int walk(int a[],int index,int target)
    {
        if(index==0)
        {
           if(target%a[index]==0)
               return(target/a[index]);
            else
                return((int)1e9);
        }
        if(target==0)
            return 0;
        
        if(dp[index][target]!=-1)
            return dp[index][target];
        
        int notpick=walk(a,index-1,target);
        int pick=(int)1e9;
        if(a[index]<=target)
            pick=1+walk(a,index,target-a[index]);
        
        return (dp[index][target]=Math.min(pick,notpick));
    }
    
    
    public int numSquares(int n) {
        
       
        
        int i=0;
        int x=1;
        int a[]=new int[n];
        while(x*x<=n)
        {
           a[i++]=x*x;
            x++;          
        }
      
        
        dp=new int[i][n+1];
        
        for(int j=0;j<i;j++)
            Arrays.fill(dp[j],-1);
        
        return walk(a,i-1,n);
        
        
        
        
        
        
        
        
        
    }
}