//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    
    
    static void dfs(char a[][],boolean vis[][],int row,int col)
    {
        vis[row][col]=true;
        int n=a.length;
        int m=a[0].length;
        
        int x[]={-1,0,1,0};
        int y[]={0,1,0,-1};
        for(int i=0;i<4;i++)
        {
            int ro=row+x[i];
            int co=col+y[i];
            if(ro>=0&&co>=0&&ro<n&&co<m&&a[ro][co]=='O'&&vis[ro][co]==false)
                dfs(a,vis,ro,co);
        }
    }
    static char[][] fill(int n, int m, char a[][])
    {
        
        // int n=a.length;
        // int m=a[0].length;
        boolean vis[][]=new boolean[n][m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0||i==n-1||j==0||j==m-1)
                {
                    if(a[i][j]=='O'&&vis[i][j]==false)
                    dfs(a,vis,i,j);
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
        return a;
        
        
    }
}