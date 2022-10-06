class Solution {
    public int findKthLargest(int[] a, int k) {
        
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<a.length;i++)
        {
            pq.add(a[i]);
        }
        int x=a[0];
        for(int i=1;i<=k;i++)
            x=pq.poll();
        return(x);
        
    }
}