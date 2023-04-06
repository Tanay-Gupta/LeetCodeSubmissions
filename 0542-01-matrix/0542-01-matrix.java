class Pair
{
    int first;
    int second;
    int third;
    Pair(int x,int y,int z)
    {
        this.first=x;
        this.second=y;
        this.third=z;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] grid) {
        
        
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        int dis[][]=new int[m][n];
        
        Queue<Pair> q=new LinkedList<>();
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0)
                {
                     q.add(new Pair(i,j,0));
                     vis[i][j]=true;
                }
               
            }
        }
        int x[]={-1,0,1,0};
        int y[]={0,1,0,-1};
        while(!q.isEmpty())
        {
            int row=q.peek().first;
            int col=q.peek().second;
            int step=q.peek().third;
            dis[row][col]=step;
            q.poll();
            for(int i=0;i<4;i++)
            {
                int ro=row+x[i];
                int co=col+y[i];
                
                if(ro>=0&&ro<m&&co>=0&&co<n&&vis[ro][co]==false)
                {
                    vis[ro][co]=true;
                    q.add(new Pair(ro,co,step+1));
                }
            }
        }
        return dis;
        
        
    }
}