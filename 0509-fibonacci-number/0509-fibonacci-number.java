class Solution {
    
    int memo[];
        
    public int fibo(int n)
    {
        int res;
       if(memo[n]==-1)
       {
           
           if(n==1||n==0)
               res=n;
           else
               res=fibo(n-1)+fibo(n-2);
            memo[n]=res;   
       }
        return(memo[n]);
    }
    public int fib(int n) {
        memo=new int[n+1];
        Arrays.fill(memo,-1);
        return(fibo(n));
    }
}