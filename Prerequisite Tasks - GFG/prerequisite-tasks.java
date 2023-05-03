//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String args[]) throws IOException
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
		while(t>0)
		{
		    int N = sc.nextInt();
		    int P = sc.nextInt();
		    int prerequisites[][] = new int[P][2];
		    for(int i=0;i<P;i++)
		    {
		        for(int j=0;j<2;j++)
		        {
		            prerequisites[i][j] = sc.nextInt();
		        }
		    }
			Solution ob = new Solution();
			if(ob.isPossible(N,prerequisites))
			{
			    System.out.println("Yes");
			}
			else{
			    System.out.println("No");
			}
			t--;
		}
	}
	
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
     public boolean dfs(boolean vis[],boolean pathvis[], ArrayList<ArrayList<Integer>> adj,int node)
    {
        
       
        vis[node]=true;
        pathvis[node]=true;
        for(int i:adj.get(node))
        {
            if(vis[i]==false)
            {
                 
                if(dfs(vis,pathvis,adj,i)==true)
                return true;
               
            }
            else if(pathvis[i]==true)
                return true;
        }
         pathvis[node]=false;
        return false;
    }
    public boolean isPossible(int n, int[][] a)
    {
        
        
         ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<Integer>());
        
        for(int i=0;i<a.length;i++)
            adj.get(a[i][1]).add(a[i][0]);
        boolean vis[]=new boolean[n];
        boolean pathvis[]=new boolean[n];
        
         for(int i=0;i<n;i++)
        {
            if(vis[i]==false)
            {
                if(dfs(vis,pathvis,adj,i)==true)
                return false;
            }
        }
        return true;
    }
    
}