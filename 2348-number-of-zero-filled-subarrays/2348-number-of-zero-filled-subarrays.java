class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
        
        
    long c=0;
        
        long sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
               c++;
            else
            {
                sum+=(c*(c+1))/2;
                c=0;
            }
        }
         sum+=(c*(c+1))/2;
        
        return sum;
    }
}