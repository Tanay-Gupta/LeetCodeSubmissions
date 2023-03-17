class Solution {
    
    int MAX=100000000;
    int dp[][][];
    int walk(int houses[],int cost[][],int i,int tar,int prevColor)
    {
        if(i>=houses.length||tar<0)
            return tar==0?tar:MAX;
        
        if(dp[i][tar][prevColor]>0)
            return dp[i][tar][prevColor];
        
        
        if(houses[i]!=0)
            return walk(houses,cost,i+1,tar-((prevColor!=houses[i])?1:0),houses[i]);
        
        
        int ans=MAX;
        
        for(int color=1;color<=cost[i].length;color++)
            ans=Math.min(ans,cost[i][color-1]+walk(houses,cost,i+1,tar-((prevColor!=color)?1:0),color));
        return dp[i][tar][prevColor]=ans;
        
    }
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        dp = new int[m+1][target+1][n+1];
        int res = walk(houses, cost, 0, target, 0);
        return res == MAX ? -1 : res;
    }
}