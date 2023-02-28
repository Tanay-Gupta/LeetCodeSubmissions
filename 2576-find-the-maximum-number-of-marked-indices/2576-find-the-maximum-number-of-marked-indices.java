class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        
        
        Arrays.sort(nums);
        int s=0;
        int e=(nums.length+1)/2;
        int count=0;
        while(e<nums.length)
        {
            if(2*nums[s]<=nums[e])
            {
                count++;
                s++;
            }
            e++;
        }
        return count*2;
        
    }
}