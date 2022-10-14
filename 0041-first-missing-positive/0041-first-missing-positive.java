class Solution {
    public int firstMissingPositive(int[] nums) {
        
        //Method 1 using extra space
     HashSet<Integer> ar=new HashSet<>();
        int x=1,i;
        for(i=0;i<nums.length;i++)
            ar.add(nums[i]);
        
        
        while(x<Integer.MAX_VALUE)
        {
            if(ar.contains(x)==false)
           break;

            x++;
        }
        return(x);
        
         
    }
}