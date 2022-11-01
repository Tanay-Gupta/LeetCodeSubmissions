class Solution {
    
   int dp[][];
    
    public int walk(int a[],int ind,int sum)
    {
        if(ind==0)
        {
          if(sum==0&&a[ind]==0)
              return(2);
          if(sum==0||a[ind]==sum)
                return(1);
          return(0);
        }
        
        if(dp[ind][sum]!=-1)
            return(dp[ind][sum]);
        int notpick=walk(a,ind-1,sum);
        int pick=0;
        if(a[ind]<=sum)
            pick=walk(a,ind-1,sum-a[ind]);
        return dp[ind][sum]=pick+notpick;
    }
    public int findTargetSumWays(int[] nums, int target) {
        
         int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
             
       if(sum-target<0||(sum-target)%2!=0)
           return(0);
        
        dp=new int[nums.length+1][(sum-target)/2+1];
       
        for(int i=0;i<nums.length+1;i++)
             Arrays.fill(dp[i],-1);
   
        
        return(walk(nums,nums.length-1,(sum-target)/2));
    }
}