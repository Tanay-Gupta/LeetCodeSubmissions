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
    public boolean canFinish(int n, int[][] a) {
        
        
        
        
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