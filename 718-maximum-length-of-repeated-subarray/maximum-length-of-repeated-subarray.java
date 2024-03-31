class Solution {
    public int findLength(int[] a, int[] b) {


// longest common substring
        int m=a.length;
        int n=b.length;
        int dp[][]=new int [m+1][n+1];
        int max=0;
        for(int i=1;i<=a.length;i++){

            for(int j=1;j<=b.length;j++){

                if(a[i-1]==b[j-1]) {

                    dp[i][j]=1+dp[i-1][j-1];

                    max=Math.max(max,dp[i][j]);

                }
                else
                dp[i][j]=0;

            }

         

        }
   return max;


        
    }
}