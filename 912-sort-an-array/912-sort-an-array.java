class Solution {
    public int[] sortArray(int[] nums) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        int i;
        int l=nums.length;
        for(i=0;i<l;i++)
        {
            pq.add(nums[i]);
        }
        for(i=0;i<l;i++)
        {
            nums[i]=pq.poll();
        }
        return(nums);
        
        
    }
}