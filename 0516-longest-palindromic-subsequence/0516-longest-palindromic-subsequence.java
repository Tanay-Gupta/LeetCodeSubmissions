class Solution {
    public int longestPalindromeSubseq(String text1) {
        
        
        //using concept of longest common subsequence
        //all we need to find is LCS in string and its  reverse
        
        
        int memo[][]=new int[text1.length()+1][text1.length()+1];
        
        StringBuffer br=new StringBuffer(text1);
        br.reverse();
        String text2=br.toString();
            
        for(int i=1;i<=text1.length();i++)
        {
            for(int j=1;j<=text2.length();j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1)) 
                     memo[i][j]=1+memo[i-1][j-1];
                else
                    memo[i][j]=Math.max(memo[i-1][j],memo[i][j-1]);
                    
            }
        }
        
        return(memo[text1.length()][text1.length()]);
        
        
        
        
    }
}