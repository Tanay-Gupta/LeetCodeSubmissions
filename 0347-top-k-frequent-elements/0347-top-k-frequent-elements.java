class Solution {
    public int[] topKFrequent(int[] nums, int k) {  
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
            map.put(i,map.getOrDefault(i,0)+1);
        
        
        int a[][]=new int[map.size()][2];
        int x=0;
        for(Map.Entry<Integer,Integer> i:map.entrySet())
        {
            int key=i.getKey();
            int value=i.getValue();
            a[x][0]=key;
            a[x++][1]=value;
        }
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->hash_map.get(b) - hash_map.get(a));
  //  pq.addAll(hash_map.keySet());
        Arrays.sort(a,(q,y)->Integer.compare(y[1],q[1]));
        int b[]=new int[k];
        for(int i=0;i<k;i++ )
        {
            b[i]=a[i][0];
        }
        return b;
        
    }
}