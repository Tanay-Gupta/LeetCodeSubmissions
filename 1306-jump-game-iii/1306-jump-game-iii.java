class Solution {
    public boolean helper(int idx,int[] arr,int[] dp){
        if(idx>=arr.length || idx<0){
            return false;
        }
        if(arr[idx]==0){
            return true;
        }
        // if(dp[idx]!=-1){
        //     return dp[idx]==1?true:false;
        
        if(dp[idx]!=-1){
            return false;
        }
        dp[idx]=1;
        if(helper(idx+arr[idx],arr,dp)){
            
            return true;
        }
        if(helper(idx-arr[idx],arr,dp)){

            return true;
        }
        dp[idx]=0;
        return false;
    }
    public boolean canReach(int[] arr, int start) {
        int[] dp=new int[arr.length];
        Arrays.fill(dp,-1);
        return helper(start,arr,dp);
    }
}