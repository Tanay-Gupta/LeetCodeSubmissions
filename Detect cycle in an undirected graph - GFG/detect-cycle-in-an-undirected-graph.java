//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends

class Pair
{
    int first;
    int second;
    Pair(int x,int y)
    {
        this.first=x;
        this.second=y;
    }
}
class Solution {


    public boolean bfs(int src,int V,boolean vis[],ArrayList<ArrayList<Integer>> adj)
    {
        vis[src]=true;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(src,-1));
        while(!q.isEmpty())
        {
            int node=q.peek().first;
            int parent=q.peek().second;
            q.poll();
            for(int i:adj.get(node))
            {
                if(vis[i]==false)
                {
                    vis[i]=true;
                    q.add(new Pair(i,node));
                }
                else if(i!=parent)
                return true;
            }
        }
        return false;
    }
    public boolean dfs(int node,int parent,boolean vis[],ArrayList<ArrayList<Integer>> adj)
    {
        vis[node]=true;
        for(int adjNode:adj.get(node))
        {
            if(vis[adjNode]==false)
            {
                if(dfs(adjNode,node,vis,adj)==true)
                return true;
            }
            else if(adjNode!=parent)
            return true;
        }
        return false;
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        
        
        
        boolean vis[]=new boolean[V];
        
        for(int i=0;i<V;i++)
        {
            if(vis[i]==false)
            {
                if(bfs(i,-1,vis,adj)==true)
                return true;
            }
        }
        return false;
        // Code here
    }
}