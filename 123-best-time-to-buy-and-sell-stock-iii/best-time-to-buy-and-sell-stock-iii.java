class Solution {

    int walk(int[] a, int i, int buy, int[][][] dp,int cap){

        if(i==a.length || cap>=2) return 0;

        if(dp[i][buy][cap]!=-1) return dp[i][buy][cap];

        int profit=0;

        if(buy==0) profit=Math.max(0+walk(a,i+1,0,dp,cap),-a[i]+walk(a,i+1,1,dp, cap));
         if(buy==1) profit=Math.max(0+walk(a,i+1,1,dp,cap),a[i]+walk(a,i+1,0,dp, cap+1));
        
        return dp[i][buy][cap]=profit;
    }
    public int maxProfit(int[] a) {

        // Creating a 3D dp array of size [n][2][3]
        int n=a.length;
        int[][][] dp = new int[n][2][3];

        // Initialize the dp array with -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return walk(a,0,0,dp,0);


        
    }
}