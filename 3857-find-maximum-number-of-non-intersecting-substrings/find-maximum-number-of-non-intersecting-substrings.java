class Solution {
    public int maxSubstrings(String s) {

        Deque<Integer>[] last=new LinkedList[26]; // aage peeche dono se accesss hai
         for (int k = 0; k < 26; k++) {
            last[k] = new LinkedList<>();
        }

        int n=s.length();

        int dp[]=new int[n+1];

        for(int i=0;i<n;i++){

            int c=s.charAt(i)-'a';
            dp[i+1]=dp[i];
            for(int j: last[c]){// us char ke deque me chalge gye
                    if(i-j+1>=4){
                        dp[i+1]=Math.max(dp[i+1],dp[j]+1);
                    }

            }
            last[c].addLast(i);
            if(last[c].size()>4) last[c].removeFirst();

        }
        return dp[n];
    }
}