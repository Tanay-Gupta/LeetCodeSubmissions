class Solution {

     int dp[][];
    public int walk(int m,int n ){

        if(m==0 && n==0) return 1;
        if(m<0||n<0) return 0;

        if(dp[m][n]!=-1) return dp[m][n];

        return dp[m][n]=walk(m-1,n)+walk(m,n-1);
    }
    public int uniquePaths(int m, int n) {
        // there is a tabulation method too. check other submission

        dp=new int[m+1][n+1];
        for(int i=0;i<m;i++) Arrays.fill(dp[i],-1);
        return walk(m-1,n-1);
    }
}