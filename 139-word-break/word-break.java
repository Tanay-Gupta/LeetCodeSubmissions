class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {


        boolean dp[]=new boolean[s.length()+1];

        int l=s.length();
        dp[l]=true;

        for(int i=l-1;i>=0;i--){

            for(String wd: wordDict){

                if(i+wd.length()<=s.length()&& s.startsWith(wd, i))
                dp[i]=dp[i+wd.length()];

                if(dp[i]) break;
            }
        }
        return dp[0];


        
    }
}