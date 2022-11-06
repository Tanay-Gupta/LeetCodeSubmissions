class Solution {
    public String shortestCommonSupersequence(String text1, String text2) {
        
        
        int[][] memo=new int[text1.length()+1][text2.length()+1];
        
        
        
        
        
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
        
        
        
        
        //length of longest common subsquence mil gya ab reverse me jaa ke word banana hai
        
        
        // length of lcs=memo[text1.length()][text2.length()]
        int l1=text1.length();
        int l2=text2.length();
        
        
        int i=l1,j=l2;
        String newWord="";
        while(i>0&&j>0)
        {
            if(text1.charAt(i-1)==text2.charAt(j-1))
            {
                newWord=text1.charAt(i-1)+newWord;
                i--;
                j--;
            }
            else if(memo[i-1][j]>memo[i][j-1])
            {
                 newWord=text1.charAt(i-1)+newWord;
                i--;
                
            }
            else
            {
                 newWord=text2.charAt(j-1)+newWord;
                j--;
            }
            
        }
        
        while(i>0){ newWord=text1.charAt(i-1)+newWord; i--;}
        while(j>0){ newWord=text2.charAt(j-1)+newWord;j--;}
          return(newWord);
        
    }
}