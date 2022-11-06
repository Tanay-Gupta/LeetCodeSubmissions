class Solution {
    public int minInsertions(String s) {
        
        
        //well well well all we need to find is Tot len-len of longest palindromic string
        
        
        
        //using dp tabulation method
        
        int n=s.length();
        int dp[][]=new int[n+1][n+1];
        
        int i,j;
        
        
        StringBuffer br=new StringBuffer(s);
        br.reverse();
        String s2=br.toString();
        
        for(i=1;i<n+1;i++)
        {
            for(j=1;j<n+1;j++)
            {
                
                if(s.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        
        return(n-dp[n][n]);
    }
}