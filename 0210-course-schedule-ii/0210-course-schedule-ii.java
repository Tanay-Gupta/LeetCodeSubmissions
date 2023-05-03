class Solution {
    public int[] findOrder(int n, int[][] a) {
        
        
        //creating adj list
        
        List<List<Integer>> adj=new ArrayList<>(n);
 for(int i=0;i<n;i++)
            adj.add(new ArrayList<Integer>());
        for(int i=0;i<a.length;i++)
        {
            adj.get(a[i][1]).add(a[i][0]);
        }
        
        int[] indeg=new int[n];
        //indegreee of a node refers to number of node visting this node
        
        for(int i=0;i<n;i++)
        {
            for(int j:adj.get(i))
            indeg[j]++;
        }
        
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(indeg[i]==0)
                q.add(i);
        }
        int topo[]=new int[n];
        int j=0;
        //List<Integer> topo=new ArrayList<>();
        while(!q.isEmpty())
        {
            int node=q.poll();
            topo[j++]=node;
            
            for(int i:adj.get(node))
            {
                indeg[i]--;
                if(indeg[i]==0)
                    q.add(i);
            }
            
        }
        
        
       
       if(j==n)
           return topo;
        int[] arr={};
            return arr;
        
        
        
        
        
        
        
        
    }
}