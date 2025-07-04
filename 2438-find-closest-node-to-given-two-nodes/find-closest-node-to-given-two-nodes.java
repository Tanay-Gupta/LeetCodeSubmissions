class Solution {

    void dfs(int current, int distance, int[] edges,int[] distances){
        while(current!=-1&&distances[current]==-1){
            distances[current]=distance++;
            current=edges[current];
        }
    }
    public int closestMeetingNode(int[] edges, int node1, int node2) {


        int res=-1,minMax=Integer.MAX_VALUE,n=edges.length;

        int[] dist1=new int[n];
        int[] dist2=new int[n];

        Arrays.fill(dist1,-1);
        Arrays.fill(dist2,-1);

        dfs(node1,0,edges,dist1);
        
        dfs(node2,0,edges,dist2);

        for(int i=0;i<n;i++){

            if(dist1[i] >= 0 && dist2[i] >= 0){
                int maxDist=Math.max(dist1[i],dist2[i]);
                if(maxDist<minMax){
                    minMax=maxDist;
                    res=i;
                }
            }
        }
        return res;


        
    }
}