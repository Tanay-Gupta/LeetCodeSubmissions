class Solution {
    public int pivotIndex(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        
        int i;
        for(i=1;i<nums.length;i++)
        {
            left[i]=left[i-1]+nums[i-1];
        }
        for(i=0;i<nums.length-1;i++)
        {
            right[i]=left[nums.length-1-i]+nums[nums.length-1-i]-nums[i];
        }
          for(i=0;i<nums.length-1;i++)
        {
            //P[P.length - 1] - P[i] - nums[i].
            right[i]=left[nums.length-1]+nums[nums.length-1]-left[i]-nums[i];
          //  System.out.print(right[i]+" ");
        }
        for(i=0;i<nums.length;i++)
        {
            if(right[i]==left[i])
               return(i);
        }
        return(-1);
        
    }
}