class Solution {
    
    
//     int dp[][];
//     public int walk(List<List<Integer>> a, int i,int j)
//     {
//         if(i+1==a.size())
//             return(a.get(i).get(j));
//         if(dp[i][j]!=-1)
//             return(dp[i][j]);
//         int sameIndex,nextIndex;
        
//         sameIndex=a.get(i).get(j)+walk(a,i+1,j);
//         nextIndex=a.get(i).get(j)+walk(a,i+1,j+1);
        
//         return(dp[i][j]=Math.min(sameIndex,nextIndex));
        
        
//     }
    public int minimumTotal(List<List<Integer>> triangle) {
       int n=triangle.size();
        
//         dp=new int[n][n];
//          for(int i=0;i<n;i++)
//              Arrays.fill(dp[i],-1);
//         return(walk(triangle,0,0));
        int dp[]=new int[n];
     
        
        int i,j;
        for(i=0;i<n;i++)
            dp[i]=triangle.get(n-1).get(i);
        
        for(i=n-2;i>=0;i--)
        {
            int curr[]=new int[n];
            for(j=i;j>=0;j--)
            {
               // System.out.print(dp[j]+" <---dp hai--->"+dp[j+1]+" ");
              int sameIndex=triangle.get(i).get(j)+dp[j];
              int nextIndex=triangle.get(i).get(j)+dp[j+1];
             curr[j]=Math.min(sameIndex,nextIndex);
               // System.out.println(curr[j]+" ");
            }
            dp=curr;
        }
        
            
        return(dp[0]);
        
        
        
    }
}