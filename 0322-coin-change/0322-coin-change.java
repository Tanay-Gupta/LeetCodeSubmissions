class Solution {
    int dp[][];
    public int coin(int a[],int index,int t)
    {
        if(index==0)
        {
            if(t%a[0]==0)
                return(t/a[0]);
            else
                return((int)1e9);
        }
        if(dp[index][t]!=-1)
            return(dp[index][t]);
        int notTake=0+coin(a,index-1,t);
        int take=Integer.MAX_VALUE;
        if(a[index]<=t)
            take=1+coin(a,index,t-a[index]);
        return(dp[index][t]=Math.min(take,notTake));
    }
    public int coinChange(int[] a, int amount) {
        dp=new int[a.length+1][amount+1];
        for(int i=0;i<a.length;i++)
            Arrays.fill(dp[i],-1);
     int ans=coin(a,a.length-1,amount);
      return(ans>=(int)1e9?-1:ans);
        
    }
}