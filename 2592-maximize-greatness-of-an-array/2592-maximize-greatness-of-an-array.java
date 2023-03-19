class Solution {
    public int maximizeGreatness(int[] nums) {
        
        Arrays.sort(nums);
        Queue<Integer> s=new LinkedList<>();
        
        for(int i:nums)
            s.add(i);
        int c=0;
        int i=0;
        while(!s.isEmpty())
        {
            if(nums[i]<s.peek())
            {
                c++;
                i++;
            }
                s.poll();
                
        }
        return c;
        
    }
}