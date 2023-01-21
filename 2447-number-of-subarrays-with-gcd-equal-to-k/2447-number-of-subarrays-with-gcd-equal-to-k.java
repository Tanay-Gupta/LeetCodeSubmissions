class Solution {
    
    
    
    public int hcf(int a,int b)
    {
        
      
        if(b==0)
            return a;
        
       return(hcf(b,a%b));
    }
    public int subarrayGCD(int[] nums, int k) {
  
        
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            
            int currhcf=nums[i];
            for(int j=i;j<nums.length;j++)
            {
                currhcf=hcf(currhcf,nums[j]);
                if(currhcf==k)
                    count++;
               // System.out.println(currhcf);
                if(currhcf<k)break;
            }
        }
        
        return count;
        
    }
}