class Solution {
    
    
    int a[];
    public int maxi(int b[],int n)
    {
        if(n==0)
            return(b[n]);
        if(n<=0)
            return(0);
        
        if(a[n]!=-1)
            return(a[n]);
        
        int pick=b[n]+maxi(b,n-2);
        int notpick=0+maxi(b,n-1);
        return(a[n]=Math.max(pick,notpick));
        
    }
    public int rob(int[] nums) {

        a=new int[nums.length+1];
        Arrays.fill(a,-1);
        return(maxi(nums,nums.length-1));
    }
}