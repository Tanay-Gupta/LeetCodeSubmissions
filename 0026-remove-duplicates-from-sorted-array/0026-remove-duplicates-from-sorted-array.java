class Solution {
    public int removeDuplicates(int[] nums) {
        
        
      int i=0,j=0,val=Integer.MAX_VALUE;
      for(i=0;i<nums.length;i++)
      {
          if(nums[i]!=val)
          {
              nums[j++]=val=nums[i];
          }
      }
        return(j);
    }
}