class Solution {
    public int longestIncreasingPath(int[][] a) {
int row = a.length;
        int col = a[0].length;
        if (row == 1 && col == 1) {
            return 1;
        }
      int dp[][]=new int[a.length][a[0].length];

      int ans=0;

      for(int i =0;i<a.length;i++){

        for(int j=0;j<a[0].length;j++){
            ans=Math.max(ans,walk(a,i,j,dp));
        }
      }
      return ans;


        
    }

    public int walk(int a[][], int i, int j, int dp[][]){


        if(dp[i][j]!=0) return dp[i][j];


        int row=a.length;
        int col=a[0].length;

        int dir[][]={{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int ans=1;
        for(int dirs[]: dir){
            int newx=i+dirs[0];
            int newy=j+dirs[1];

            if(newx<0||newy<0||newx>=row||newy>=col) continue;
            if(a[newx][newy]<=a[i][j]) continue;

            ans=Math.max(ans,walk(a,newx,newy,dp)+1);
        }
        return dp[i][j]=ans;
    }
}