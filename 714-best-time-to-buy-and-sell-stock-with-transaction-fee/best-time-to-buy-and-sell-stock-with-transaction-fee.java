class Solution {

     public int walk(int[] a, int i,int buy, int dp[][],int fee){
 
        if(i==a.length) return 0;

        if(dp[i][buy]!=-1) return dp[i][buy];
        int profit=0;
        if(buy==0) profit=Math.max(0+walk(a,i+1,0,dp,fee),-a[i]+walk(a,i+1,1,dp,fee));
        if(buy==1) profit=Math.max(0+walk(a,i+1,1,dp,fee),a[i]-fee+walk(a,i+1,0,dp,fee));

        return dp[i][buy]=profit;
    }
    public int maxProfit(int[] a, int fee) {

         int dp[][]=new int [a.length][2];

        for(int i=0;i<a.length;i++) Arrays.fill(dp[i],-1);

        return walk(a,0,0,dp,fee);
        
    }
}