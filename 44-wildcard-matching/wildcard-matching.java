class Solution {

    public int wwl(String s1, String s2, int i, int j, int dp[][]) {

        if (i < 0 && j < 0)
            return 1; // both same
        if (i < 0 && j >= 0)
            return 0;// not matched completely

        if (j < 0 && i >= 0)
            return isAllStar(s1, i)?1:0;

        if (dp[i][j] != -1)
            return isAllStar(s1, i) ? 1 : 0;

        if (s1.charAt(i) == s2.charAt(j) || s1.charAt(i) == '?')
            return dp[i][j] = wwl(s1, s2, i - 1, j - 1, dp);

        else {
            if (s1.charAt(i) == '*')
                return dp[i][j] = wwl(s1, s2, i - 1, j, dp) == 1 || wwl(s1, s2, i, j - 1, dp) == 1 ? 1 : 0;
            else
                return 0;
        }

    }

    boolean isAllStar(String s,int index){

        for(int i=0;i<=index;i++){

            if(s.charAt(i)!='*') return false;
        }
        return true;
    }

    public boolean isMatch(String s, String p) {


           int m=p.length();
           int n=s.length();
int dp[][]=new int[m][n];
           for(int i=0;i<m;i++)
           Arrays.fill(dp[i],-1);
        return wwl(p, s, p.length()-1,s.length()-1,dp)==1?true:false;
    }
}