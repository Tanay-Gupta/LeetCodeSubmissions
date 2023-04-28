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
            int V = sc.nextInt();
            int E = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);
            for (int i : safeNodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {


    public boolean dfscycle(int node,List<List<Integer>> adj,boolean vis[],boolean pathvis[],boolean check[])
    {
        
        vis[node]=true;
        pathvis[node]=true;
        
        for(int i:adj.get(node))
        {
            if(vis[i]==false)
            {
                if(dfscycle(i,adj,vis,pathvis,check)==true)
                return true;
            }
            else if(pathvis[i]==true)
            return true;
        }
        pathvis[node]=false;
        check[node]=true;
        return false;
    }
    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {
        
        boolean vis[]=new boolean[V];
        boolean pathvis[]=new boolean[V];
        boolean check[]=new boolean[V];
        
        for(int i=0;i<V;i++)
        {
            if(vis[i]==false)
            dfscycle(i,adj,vis,pathvis,check);
        }
        List<Integer> ar=new ArrayList<>();
        for(int i=0;i<V;i++)
        if(check[i]==true)
        ar.add(i);
        return ar;


        // Your code here
    }
}
