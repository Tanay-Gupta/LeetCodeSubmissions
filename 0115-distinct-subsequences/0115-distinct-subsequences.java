class Solution {
    
    int dp[][];
    public int walk(String s, String t, int i,int j)
    {
        if(j==0)
            
            

         return( 1);
        if(i==0)
            return(0);
        if(dp[i][j]!=-1)
            return(dp[i][j]);
        
        if(s.charAt(i-1)==t.charAt(j-1))
        {
            return(dp[i][j]=walk(s,t,i-1,j-1)+walk(s,t,i-1,j));
        }
        else
        {
            return(dp[i][j]=walk(s,t,i-1,j));
        }
        
        
    }
    public int numDistinct(String s, String t) {
        
        dp=new int[s.length()+1][t.length()+1];
        for(int i=0;i<s.length()+1;i++)
            Arrays.fill(dp[i],-1);
        return(walk(s,t,s.length(),t.length()));
    }
}