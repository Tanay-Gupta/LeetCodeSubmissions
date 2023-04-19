class Pair
{
    int mask;
    int node;
    int dist;
    Pair(int node,int dist,int mask)
    {
        this.mask=mask;
        this.node=node;
        this.dist=dist;
        
    }
}
class Solution {
    public int shortestPathLength(int[][] graph) {
    
            int n=graph.length;
        Queue<Pair> q=new LinkedList<>();
        Set<Integer>[] visited=new HashSet[n];
        
         for(int i=0;i<graph.length;i++)
         {
             q.add(new Pair(i,0,1<<i));
             visited[i]=new HashSet<>();
             visited[i].add(1<<i);
             
         }
    
        while(!q.isEmpty())
        {
           Pair node=q.poll();
           
         if(node.mask == (1 << n) - 1) 
                return node.dist;
            for(int i : graph[node.node]) {
			    
                int mask = node.mask | (1 << i);

                if(visited[i].add(mask)) {
                    q.add(new Pair(i,1 + node.dist,mask));
                }
            }
        }
        return -1;
            
        
        
        
        
        
        
        
    }
}

    
