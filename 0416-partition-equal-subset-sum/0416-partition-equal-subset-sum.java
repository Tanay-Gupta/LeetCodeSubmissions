class Solution {
    int dp[][];
    public boolean walk(int a[],int ind,int tar)
    {
        
        if(tar==0)
            return(true);
        if(ind==0)
            return(a[ind]==tar);
        
        if(dp[ind][tar]!=-1)return(dp[ind][tar]==1?true:false);
        
        boolean notpick=walk(a,ind-1,tar);
        boolean pick=false;
        if(tar>=a[ind])
            pick=walk(a,ind-1,tar-a[ind]);
        
        dp[ind][tar]=pick||notpick==true?1:0;
        return(pick||notpick);
    }
    public boolean canPartition(int[] a) {
        
        
        int sum=0;
        
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        
        if(sum%2!=0)return(false);
        
        
        dp=new int[a.length+1][sum+1];
        for(int i=0;i<a.length;i++)
            Arrays.fill(dp[i],-1);
        return(walk(a,a.length-1,sum/2));
        
        
        
        
        
    }
}