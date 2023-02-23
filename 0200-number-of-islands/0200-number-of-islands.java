

class Pair
{
    int first;
    int second;
    public Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Solution {
    
    
       public void bfsOnGrid(int i,int j,boolean visited[][],char [][] grid)
    {
        visited[i][j]=true;
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(i,j));
        
        int m=grid.length;
        int n=grid[0].length;
        
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
                   // System.out.println(x+""+y);
                    int nrow=row+x;
                    int ncol=col+y;
                    if(nrow>=0&&nrow<m&&ncol>=0&&ncol<n&&grid[nrow][ncol]=='1'&&visited[nrow][ncol]==false)
                    {
                        visited[nrow][ncol]=true;
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }
            
            
        }
        
    }
    
    
    public int numIslands(char[][] grid) {
        
        
          int m=grid.length;
        int n=grid[0].length;
        boolean visited[][]=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(visited[i][j]==false&&grid[i][j]=='1')
                {
                    count++;
                    bfsOnGrid(i,j,visited,grid);
                }
            }
        }
        return count;
    }
}