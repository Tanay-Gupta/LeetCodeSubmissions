class Solution {
   int dp[][];
    public int walk(int a[][],int i,int j)
    {
        if(i<0||j<0)
            return 0;
        if(a[i][j]==1)
            return 0;
        if(i==0&&j==0)
            return(1);
        
         
        if(dp[i][j]!=-1)
            return(dp[i][j]);
        
        return(dp[i][j]=walk(a,i-1,j)+walk(a,i,j-1));
        
    }
    public int uniquePathsWithObstacles(int[][] g) {
        dp=new int[g.length+1][g[0].length+1];
        
        for(int i=0;i<g.length;i++)
            Arrays.fill(dp[i],-1);
    
         return(walk(g,g.length-1,g[0].length-1));
        
        
    }
}