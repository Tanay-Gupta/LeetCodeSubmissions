class Solution {
    
    int dp[];
    public int walk(int a[],int i)
    {
        
        
        if(i==0)
            return(a[0]);
        if(i==1)
            return(a[i]);
        if(i<0)return(0);
        if(dp[i]!=-1)return(dp[i]);
        int jump1=a[i]+walk(a,i-1);
        int jump2=a[i]+walk(a,i-2);
        return(dp[i]=Math.min(jump1,jump2));
       
                   
       
    }
    public int minCostClimbingStairs(int[] cost) {
        
       dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
        
        
        return(Math.min(walk(cost,cost.length-1),walk(cost,cost.length-2)));
    }
}