class Solution {
    
   
  // memoization solution
     int dp[];
    public int walk(int i,int nums[])
    {
        if(i>=nums.length-1)
        {
            return 0;
        }
        if(dp[i]!=-1)
            return dp[i];
        int min=(int)1e9;
        for(int j=i+1;j<=i+nums[i];j++)
        {
           min=Math.min(min,1+walk(j,nums));
        }
         return dp[i]=min;   
        
        
    }
    public int jump(int[] nums) {
        
//         dp=new int[nums.length+1];
//         Arrays.fill(dp,-1);
        
        
//         return  walk(0,nums);
        
        //greedy solution
        
        int ans=0;
        int n=nums.length;
        int currEnd=0;
        int currFar=0;
        
        for(int i=0;i<n-1;i++)
        {
            currFar=Math.max(currFar,i+nums[i]);
            if(i==currEnd)
            {
                ans++;
                currEnd=currFar;
            }
        }
        return ans;
    }
}