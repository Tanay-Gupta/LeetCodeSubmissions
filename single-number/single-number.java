class Solution {
    public int singleNumber(int[] nums) {
        
        
        int i;
        int s=0;
        for(i=0;i<nums.length;i++)
            s^=nums[i];
        return(s);
        
    }
}