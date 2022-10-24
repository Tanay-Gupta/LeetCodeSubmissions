class Solution {
    
    
    int dp[][];
    public int walk(List<List<Integer>> a, int i,int j)
    {
        if(i+1==a.size())
            return(a.get(i).get(j));
        if(dp[i][j]!=-1)
            return(dp[i][j]);
        int sameIndex,nextIndex;
        
        sameIndex=a.get(i).get(j)+walk(a,i+1,j);
        nextIndex=a.get(i).get(j)+walk(a,i+1,j+1);
        
        return(dp[i][j]=Math.min(sameIndex,nextIndex));
        
        
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        
        dp=new int[n][n];
         for(int i=0;i<n;i++)
             Arrays.fill(dp[i],-1);
        return(walk(triangle,0,0));
    }
}