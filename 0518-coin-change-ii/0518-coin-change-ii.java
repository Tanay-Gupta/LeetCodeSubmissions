class Solution {
    int dp[][];
    public int walk(int a[],int ind,int amt)
    {
        if(ind==0)
        {
            if(amt==0||amt%a[0]==0)
                return(1);
            else
                return(0);
        }
        if(amt==0)
            return(1);
        if(dp[ind][amt]!=-1)
            return(dp[ind][amt]);
        
        
        int notpick=walk(a,ind-1,amt);
        int pick=0;
        if(a[ind]<=amt)
            pick=walk(a,ind,amt-a[ind]);
       return(dp[ind][amt]=pick+notpick);
    }
    public int change(int amount, int[] coins) {
        dp=new int[coins.length+1][amount+1];
        for(int i=0;i<coins.length;i++)
            Arrays.fill(dp[i],-1);
        
        return(walk(coins,coins.length-1,amount));
    }
}