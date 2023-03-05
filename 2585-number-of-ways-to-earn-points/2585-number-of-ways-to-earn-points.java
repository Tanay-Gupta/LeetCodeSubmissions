class Solution {
    
    
    long dp[][];
    public long walk(int t,int i, int[][] types)
    {
        if(t==0)
            return 1;
        if(i>=types.length||t<0) return 0;
        if(dp[i][t]!=-1) return dp[i][t];
        
        long times=0;
        for(int j=0;j<=types[i][0];j++)
        {
            times=(times+walk(t-j*types[i][1],i+1,types))%((int)1e9+7);
        }
        return (dp[i][t]=times);
    }
    public int waysToReachTarget(int target, int[][] types) {
        
        
        dp=new long[types.length+1][target+1];
        for(long[] i:dp)
            Arrays.fill(i,-1);
        return (int)walk(target,0,types);
        
        
    }
}