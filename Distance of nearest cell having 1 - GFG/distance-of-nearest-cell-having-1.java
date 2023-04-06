//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends

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
class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    
    
    public int[][] nearest(int[][] grid)
    {
        // Code here
        
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        int dis[][]=new int[m][n];
        
        Queue<Pair> q=new LinkedList<>();
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
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