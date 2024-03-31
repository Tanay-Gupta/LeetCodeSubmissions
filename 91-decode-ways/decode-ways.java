class Solution {


   
    int walk(String s, int index,int dp[]){

        if(index==s.length()) return 1;

        if(dp[index]!=-1) return dp[index];

        if(s.charAt(index)=='0') return 0;

        int ways =walk(s,index+1,dp);

        if(index+1<s.length()&& Integer.parseInt(s.substring(index,index+2))<=26)
        ways+=walk(s,index+2,dp);

        return dp[index]=ways;
    }
    public int numDecodings(String s) {
         
         int dp[]  =new int[s.length()];
         Arrays.fill(dp,-1);

         return walk(s, 0,dp);



        
    }
}