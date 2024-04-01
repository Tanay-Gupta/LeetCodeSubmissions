class Solution {

     int dp[][];
    public int walk(int a[], int t, int index){


        if(index==0){

            if(t%a[index]==0) return t/a[index];
            return (int )1e9;
        }

        if(dp[index][t]!=-1) return dp[index][t];
        int notpick=0+ walk(a, t, index-1);
        int pick=(int)1e9;

        if(t>=a[index]){
            pick=1+walk(a, t-a[index],index);
        }

        return dp[index][t]=Math.min(pick,notpick);
    }
    public int coinChange(int[] coins, int amount) {
        

        dp=new int[coins.length+1][amount+1];

        for(int i=0;i<coins.length;i++) Arrays.fill(dp[i],-1);

        int ans=walk(coins, amount, coins.length-1);
        return ans>=(int)1e9? -1: ans;
    }
}