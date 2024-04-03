class Solution {


    Integer dp[][];

    public int walk(String a, String b, int i, int j){
     if(i<0) return j+1;// to add j+1 charactes in a

     if(j<0) return i+1;// to remove i+1 characters from a
     if(dp[i][j]!=null) return dp[i][j];

     if(a.charAt(i)==b.charAt(j))
      return dp[i][j]=walk(a,b, i-1,j-1);

      return dp[i][j]= 1+ Math.min(walk(a,b,i-1,j),Math.min(walk(a,b,i,j-1),walk(a,b,i-1,j-1)));
    }
    public int minDistance(String a, String b) {
        dp=new Integer[a.length()+1][b.length()+1];

        return walk(a,b,a.length()-1,b.length()-1);
    }
}