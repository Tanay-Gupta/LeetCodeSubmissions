//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    
    
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
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        boolean vis[]=new boolean[V];
        boolean pathvis[]=new boolean[V];
        
        
        for(int i=0;i<V;i++)
        {
            if(vis[i]==false)
            {
                if(dfs(vis,pathvis,adj,i)==true)
                return true;
            }
        }
        return false;
    }
}