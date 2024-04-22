class Solution {
    int getMaxP(int a[],int i, int buy,int cap, int dp[][][]){


        if(i==a.length|| cap==0) return 0;
        if(dp[i][buy][cap]!=-1) return dp[i][buy][cap];

        int profit=0;

        if(buy==0) profit=Math.max(0+getMaxP(a,i+1,0,cap,dp),-a[i]+getMaxP(a,i+1,1,cap,dp));
        if(buy==1) profit=Math.max(0+getMaxP(a,i+1,1,cap,dp),a[i]+getMaxP(a,i+1,0,cap-1,dp));

        return dp[i][buy][cap]=profit;
    }
    public int maxProfit(int k, int[] a) {

        int n=a.length;
        int dp[][][]=new int[n][2][k+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return getMaxP(a,0,0,k,dp);        
    }
}