class Solution {
    
    
    
    Long dp[];
    
    
    public long walk(int i,int a[][])
    {
        
        if(i>=a.length)
            return 0;
        if(dp[i]!=null)
            return dp[i];
        
        long pick=a[i][0]+walk(i+a[i][1]+1,a);
        long notpick=walk(i+1,a);
        return dp[i]=Math.max(pick,notpick);
    }
    public long mostPoints(int[][] questions) {
        dp=new Long[questions.length];
        
        return walk(0,questions);
        
    }
}