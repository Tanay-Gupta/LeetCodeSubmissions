//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    void dfs(boolean vis[][],int grid[][],int r,int c,int r0,int c0,ArrayList<String> ar)
    {
        vis[r][c]=true;
        ar.add(Integer.toString(r-r0)+" "+Integer.toString(c-c0));
        
         int m=grid.length;
        int n=grid[0].length;
        int x[]={-1,0,1,0,-1};
        
        for(int i=0;i<4;i++)
        {
           int ro=r+x[i];
           int co=c+x[i+1];
           
           if(ro<m&&ro>=0&&co<n&&co>=0&&vis[ro][co]==false&&grid[ro][co]==1)
           {
               dfs(vis,grid,ro,co,r0,c0,ar);
           }
        }
        
        
        
    }
    int countDistinctIslands(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        HashSet<ArrayList<String>> h=new HashSet<>();
        for(int i=0;i<m;i++ )
        {
            for(int j=0;j<n;j++)
            {
                if(vis[i][j]==false&&grid[i][j]==1)
                {
                    
                    ArrayList<String> ar=new ArrayList<>();
                    
                    dfs(vis,grid,i,j,i,j,ar);
                    
                    h.add(ar);
                   
                }
            }
        }
        return h.size();
        // Your Code here
    }
}
