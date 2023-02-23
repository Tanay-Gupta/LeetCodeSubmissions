class Solution {
    public int maximumProduct(int[] nums, int k) {
        
        
        
        PriorityQueue<Integer> q=new PriorityQueue<>();
        
        for(int i:nums)
            q.add(i);
        
        
        while(k>0)
        {
            int x=q.poll();
            x++;
            q.add(x);
            k--;
        }
        
        long sum=1;
        while(!q.isEmpty())
        {
            sum=(sum*q.poll())%((int)(1e9+7));
        }
        return (int)sum;
        
    }
}