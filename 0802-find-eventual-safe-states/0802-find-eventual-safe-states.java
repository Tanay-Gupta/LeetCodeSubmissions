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
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        
        
       
        List<List<Integer>> adj=new ArrayList<>();
        int V=graph.length;
        for(int i=0;i<graph.length;i++)
        {
            ArrayList<Integer> ar=new ArrayList<>();
            for(int j=0;j<graph[i].length;j++)
                ar.add(graph[i][j]);
            adj.add(ar);
        }
        
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
        
        
        
    }
}