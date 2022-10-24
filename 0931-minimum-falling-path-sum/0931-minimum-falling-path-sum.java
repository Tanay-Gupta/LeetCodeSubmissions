class Solution {
    int dp[][];
    public int walk(int a[][],int i,int j)
    {
        if(j<0||i<0||j>a.length-1)
            return((int)1e9);
        if(i==0)
        {
            return(a[i][j]);
        }
      
        if(dp[i][j]!=-200)
            return(dp[i][j]);
        int sameIndex,prevIndex,nextIndex;
        sameIndex=a[i][j]+walk(a,i-1,j);
        prevIndex=a[i][j]+walk(a,i-1,j-1);
        nextIndex=a[i][j]+walk(a,i-1,j+1);  
        return(dp[i][j]=Math.min(sameIndex,Math.min(prevIndex,nextIndex)));
            
    }
    public int minFallingPathSum(int[][] matrix) {
     
        int n=matrix.length;
        dp=new int[n+1][n+1];
        for(int i=0;i<n+1;i++)
            Arrays.fill(dp[i],-200);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,walk(matrix,n-1,n-1-i));
        }
        return(min);
    }
}