class Solution {
    
     int dp[][];
   // /  int min=Integer.MAX_VALUE;
    
    public int walk(int a[][],int i,int j)
    {
        if(i<0||j<0)
            return (int)1e9;
        if(i==0&&j==0)
             return(a[i][j]);

        if(dp[i][j]!=-1)
            return(dp[i][j]);
        
        int up=walk(a,i-1,j)+a[i][j];
        int left=walk(a,i,j-1)+a[i][j];
       
        return(dp[i][j]=Math.min(up,left));
        
    }
    public int minPathSum(int[][] g) {
        
         dp=new int[g.length+1][g[0].length+1];
        
        for(int i=0;i<g.length;i++)
            Arrays.fill(dp[i],-1);
    
         return(walk(g,g.length-1,g[0].length-1));
        
    }
}