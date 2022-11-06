class Solution {
    public int minDistance(String text1, String text2) {
        //using concept of longest commom subsequence
        
        int l1=text1.length();
        int l2=text2.length();
        
      int[][]  memo=new int[text1.length()+1][text2.length()+1];
        
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
        return(l1+l2-2*memo[text1.length()][text2.length()]);
        
    }
}