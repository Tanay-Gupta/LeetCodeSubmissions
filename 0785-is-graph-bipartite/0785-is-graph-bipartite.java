class Solution {
    
    
    public boolean dfs(ArrayList<ArrayList<Integer>> adj,int start, int[] color,int col)
    {
        
        color[start]=col;
        for(int i:adj.get(start))
        {
            if(color[i]==-1)
            { 
                if(dfs(adj,i,color,1-col)==false)
                    return false;
            }
            else if(color[i]==col)
                return false;
        }
        return true;
    }
    
    
    
     public boolean bfs(ArrayList<ArrayList<Integer>> adj,int start,int[] color)
    {
        
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        color[start]=0;
        while(!q.isEmpty())
        {
            int node=q.poll();
            
            for(int i:adj.get(node))
            {
                if(color[i]==-1)
                {
                    color[i]=1-color[node];
                    q.add(i);
                }
                else if(color[i]==color[node])
                return false;
            }
            
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        
        
        
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        
        
        for(int i=0;i<graph.length;i++)
        {
            ArrayList<Integer> ar=new ArrayList<>();
            for(int j=0;j<graph[i].length;j++)
                ar.add(graph[i][j]);
            adj.add(ar);  
            
        }
        
        int V=adj.size();
         int color[]=new int[V];
        Arrays.fill(color,-1);
        
        for(int i=0;i<V;i++)
        {
            if(color[i]==-1)
            {
                if(dfs(adj,i,color,0)==false)
                return false;
            }
        }
        return true;
        
    }
}