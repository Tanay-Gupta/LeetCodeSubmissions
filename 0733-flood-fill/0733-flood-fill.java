class Solution {
    
    class Pair
    {
        int first;
        int second;
        Pair(int first, int second)
        {
            this.first=first;
            this.second=second;
        }
    }
    public void bfs(int grid[][],int i,int j,int color,boolean vis[][])
    {
        
        vis[i][j]=true;
        int orginalColor=grid[i][j];
        grid[i][j]=color;
        
        int m=grid.length;
        int n=grid[0].length;
        
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(i,j));
        while(!q.isEmpty())
        {
            
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();
            
            for(int x=-1;x<=1;x++)
            {
                for(int y=-1;y<=1;y++)
                {
                    if(Math.abs(x)==Math.abs(y))continue;
                    int nrow=x+row;
                    int ncol=y+col;
                    
                    if(nrow>=0&&nrow<m&&ncol>=0&&ncol<n&&vis[nrow][ncol]==false&&grid[nrow][ncol]==orginalColor)
                    {
                        vis[nrow][ncol]=true;
                        grid[nrow][ncol]=color;
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }
        }
        
    }
    public int[][] floodFill(int[][] grid, int sr, int sc, int color) {
        
        int m=grid.length;
        int n=grid[0].length;
        
        boolean vis[][]=new boolean[m][n];
        
        bfs(grid,sr,sc,color,vis);
        return grid;
        
        
        
    }
}