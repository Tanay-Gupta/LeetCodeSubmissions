
class Solution {
    
    
    public void dfs(int row,int col,boolean vis[][],char a[][])
    {
        vis[row][col]=true;
        
        int x[]={-1,0,1,0,-1};
        int n=a.length;
        int m=a[0].length;
        
        
        for(int i=0;i<4;i++)
        {
            int ro=row+x[i];
            int co=col+x[i+1];
            if(ro>=0&&ro<n&&co>=0&&co<m&&vis[ro][co]==false&&a[ro][co]=='O')
                dfs(ro,co,vis,a);
        }
    }
    public void solve(char[][] a) {
        
        
        int n=a.length;
        int m=a[0].length;
        
        boolean vis[][]=new boolean[n][m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0||j==0||i==n-1||j==m-1)
                {
                    if(vis[i][j]==false&&a[i][j]=='O')
                        dfs(i,j,vis,a);
                }
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==false&&a[i][j]=='O')
                    a[i][j]='X';
            }
        }
     //   return a;
        
        
        
        
        
        
    }
};