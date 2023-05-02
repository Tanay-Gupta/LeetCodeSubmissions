class Solution {
    public int lastStoneWeight(int[] a) {
        
        
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i:a)
            q.add(i);
        
        
        
        while(q.size()>1)
        {
            int mx1=q.poll();
            int mx2=q.poll();
            int x=Math.abs(mx1-mx2);
            if(x!=0)
                q.add(x);
        }
        return q.size()==0?0: q.poll();
        
        
        
    }
}