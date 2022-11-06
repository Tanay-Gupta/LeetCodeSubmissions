class Solution {
    
    
    int memo[][];
    public int longo(String a,String b,int m,int n)
    {
        if(memo[m][n]==-1)
        {
          if(m==0||n==0)
              return(0);
            int res=0;
          if(a.charAt(m-1)==b.charAt(n-1)) 
              res=1+longo(a,b,m-1,n-1);
          else
              res=Math.max(longo(a,b,m-1,n),longo(a,b,m,n-1));
          memo[m][n]=res;  
        }
        return(memo[m][n]);
            
    }
    public int longestCommonSubsequence(String text1, String text2) {
        
       
        //----------------------------MEMOIZATION--------------------------
	    // memo=new int[text1.length()+1][text2.length()+1];
	    // for(int[] i: memo)
	    // {
	    //     Arrays.fill(i,-1);
	    // }
	    // return(longo(text1,text2,text1.length(),text2.length()));
        //----------------------------MEMOIZATION ends--------------------------
        
        memo=new int[text1.length()+1][text2.length()+1];
        
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
        return(memo[text1.length()][text2.length()]);
    }
}