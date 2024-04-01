public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) return 1;
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int max=0;
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }

                //System.out.println( i+" "+j+" "+dp[i]);
            }
            max=Math.max(max,dp[i]);
            
        }

     //   int maxLength = Arrays.stream(dp).max().orElse(0);
        return max;
    }
}