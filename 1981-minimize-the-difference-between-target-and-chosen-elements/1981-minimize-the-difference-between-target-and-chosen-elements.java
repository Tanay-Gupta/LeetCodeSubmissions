class Solution {
    
    
    Integer dp[][];
    public int walk(int index,int mat[][],int t,int sum)
    {
       
        if(index<0)
            return Math.abs(sum-t);
        
        if(dp[index][sum]!=null)
            return dp[index][sum];
        
        int min=(int)1e9;
        for(int j=0;j<mat[0].length;j++)
        {
            min=Math.min(min,walk(index-1,mat,t,sum+mat[index][j]));
        }
        
        return dp[index][sum]=min;
            
    }
    public int minimizeTheDifference(int[][] mat, int target) {
      dp=new Integer[mat.length+1][5000];
        return walk(mat.length-1,mat,target,0);
        
    }
}