class Solution {
    
    public boolean isEven(int i)
    {
        return(i%2==0);
    }
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int ar[]=new int[queries.length];
        
        
        int i;
        int sum=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
                sum+=nums[i];
        }
        
        
        for(i=0;i<queries.length;i++)
        {
            if(isEven((nums[queries[i][1]]))&&isEven(queries[i][0]))
            {
                sum+=queries[i][0];   
                nums[queries[i][1]]+=queries[i][0];
                
            }
                
            else if(isEven((nums[queries[i][1]]))==false&&isEven(queries[i][0])==false)
            {
                sum+=nums[queries[i][1]]+queries[i][0];
                nums[queries[i][1]]+=queries[i][0];
                
            }
                
              else if(isEven((nums[queries[i][1]]))==false&&isEven(queries[i][0])==true)
            {
                //sum-=nums[queries[i][1]]+queries[i][0];
                  
                nums[queries[i][1]]+=queries[i][0];
                
            }
            else
            {
                
                sum-=nums[queries[i][1]];
                nums[queries[i][1]]+=queries[i][0];
            }
            ar[i]=sum;
            
        }
        return(ar);
        
        
        
    }
}