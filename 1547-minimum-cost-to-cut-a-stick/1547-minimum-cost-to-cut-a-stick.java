class Solution {
    
    int dp[][];
    public int cutTheStick(int start,int end,int cuts[])
    {
        if(start>end) return(0);
        if(dp[start][end]!=-1)
            return(dp[start][end]);
        int min=Integer.MAX_VALUE;
        for(int i=start;i<=end;i++) 
        {
            int cost=cuts[end+1]-cuts[start-1]+cutTheStick(start,i-1,cuts)+cutTheStick(i+1,end,cuts);
            min=Math.min(cost,min);
        }
        return(dp[start][end]=min);
        
        
        
    }
    public int minCost(int n, int[] cuts) {
        
        Arrays.sort(cuts);
        
        //adding 0 and end of n to the new array
     
      
    int b[]=new int[cuts.length+2];
        int i;
        for( i=0;i<cuts.length;i++)
        {
            b[i+1]=cuts[i];
        }
        
           b[0]=0;
            b[i+1]=n;
        
        dp=new int[cuts.length+3][cuts.length+3];
        for(int j=0;j<cuts.length+3;j++)
            Arrays.fill(dp[j],-1);
        return(cutTheStick(1,cuts.length,b));
        
    }
}