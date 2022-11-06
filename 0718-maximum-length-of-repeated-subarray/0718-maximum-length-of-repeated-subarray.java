class Solution {
    public int findLength(int[] text1, int[] text2) {
        
        
       int[][]  memo=new int[text1.length+1][text2.length+1];
        int max=0;
        for(int i=1;i<=text1.length;i++)
        {
            for(int j=1;j<=text2.length;j++)
            {
                if(text1[i-1]==text2[j-1]) 
                {
                     memo[i][j]=1+memo[i-1][j-1];
                    max=Math.max(memo[i][j],max);
                }
                    
                else
                    memo[i][j]=0;
                    
            }
        }
        return(max);
        
    }
}