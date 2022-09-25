class Solution {
    public int majorityElement(int[] nums) {
        
        
        int i;
        int c=1;
       int resIndex=0;
        for(i=1;i<nums.length;i++)
        {
            if(nums[resIndex]==nums[i])
                c++;
            else
                c--;
            if(c==0)
            {
                resIndex=i;
                c=1;
            }
        }
        c=0;
        for(i=0;i<nums.length;i++)
        {
             if(nums[resIndex]==nums[i])
                 c++;
            
        }
        return(nums[resIndex]);
        
    }
}