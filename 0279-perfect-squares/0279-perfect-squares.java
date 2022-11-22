// public class Solution {
//     public int numSquares(int n) {
//        int[] dp = new int[n + 1];
//        Arrays.fill(dp, Integer.MAX_VALUE);
//        dp[0] = 0;
//        for(int i = 0; i <= n; i++){
//            for(int j = 1; i + j * j <= n; j++){
//                dp[i  + j * j] = Math.min(dp[i + j * j], dp[i] + 1);
//             }
//        }
//        return dp[n];
//     }
// }


class Solution {
    int dp[][];
    int walk(int a[],int index,int target)
    {
        if(index==0)
        {
           if(target%a[index]==0)
               return(target/a[index]);
            else
                return((int)1e9);
        }
        if(target==0)
            return 0;
        
        if(dp[index][target]!=-1)
            return dp[index][target];
        
        int notpick=walk(a,index-1,target);
        
        
        
        
        int pick=(int)1e9;
        if(a[index]<=target)
            pick=1+walk(a,index,target-a[index]);
        
        return (dp[index][target]=Math.min(pick,notpick));
    }
    
    
    public int numSquares(int n) {
        
       
        
        int i=0;
        int x=1;
        int a[]=new int[n];
        while(x*x<=n)
        {
           a[i++]=x*x;
            x++;          
        }
        
        //stored all power till n in array a[]
      
        
        dp=new int[i][n+1];// creating dp[][]
        
        for(int j=0;j<i;j++)
            Arrays.fill(dp[j],-1);
        
        return walk(a,i-1,n);
        
        
        
        
        
        
        
        
        
    }
}