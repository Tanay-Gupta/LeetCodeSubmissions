

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
    
         public int  bfsOnGrid(int i,int j,boolean visited[][],int [][] grid)
    {
        visited[i][j]=true;
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(i,j));
        
        int m=grid.length;
        int n=grid[0].length;
        int count=1;
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
                    if(nrow>=0&&nrow<m&&ncol>=0&&ncol<n&&grid[nrow][ncol]==1&&visited[nrow][ncol]==false)
                    {
                        visited[nrow][ncol]=true;
                        count++;
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }
            
            
        }
             return count;
        
    }
    public int maxAreaOfIsland(int[][] grid) {
        
        
         
        
          int m=grid.length;
        int n=grid[0].length;
        boolean visited[][]=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(visited[i][j]==false&&grid[i][j]==1)
                {
                    int x=bfsOnGrid(i,j,visited,grid);
                    //System.out.println(x);
                    count=Math.max(count,x);
                }
            }
        }
        
        return count;
        
    }
}