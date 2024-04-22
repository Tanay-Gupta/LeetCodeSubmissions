class Solution {
    public int lengthOfLIS(int[] a) {

    if(a.length==1) return 1;
    if(a==null || a.length==0) return 0;

    int n=a.length;
    int dp[]=new int[n];

    Arrays.fill(dp,1);
    int max=0;

    for(int i=0;i<n;i++){

        for(int j=0;j<i;j++){
            if(a[i]>a[j]){

                dp[i]=Math.max(dp[i],dp[j]+1);
            }
        }
        max=Math.max(max,dp[i]);
    }
        
       return max; 
    }
}