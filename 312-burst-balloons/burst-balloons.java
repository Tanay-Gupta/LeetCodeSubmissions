class Solution {
      
    public int walk(int a[],int left,int right, Integer dp[][]){

        if(left>right) return 0;
        if(dp[left][right]!=null ) return dp[left][right];
        int max=0;
        for(int i=left;i<=right;i++){

            int costLeft=walk(a,left,i-1,dp);
            int costend=a[left-1]*a[i]*a[right+1];
           int  costRight=walk(a,i+1,right,dp);
            max=Math.max(max,costLeft+costend+costRight); 
        }
        return dp[left][right]=max;
    }
    public int maxCoins(int[] a) {

        Integer dp[][]=new Integer[a.length+1][a.length+1];
        int n=a.length;
         int[] arr = new int[n+2];
        arr[0] = 1; arr[n+1] = 1;
        for(int i = 1; i <= n; i++) arr[i] = a[i-1];
        return walk(arr, 1,a.length,dp);


        
    }
}