class Solution {
    public int maxSubstrings(String s) {

        // Create an array of Deques (double-ended queues), one for each lowercase letter
        // This stores indices of the last few occurrences (up to 4) of each character
        Deque<Integer>[] last = new LinkedList[26];
        for (int k = 0; k < 26; k++) {
            last[k] = new LinkedList<>();
        }

        int n = s.length();

        // dp[i] = max number of valid substrings we can have using the first i characters
        int dp[] = new int[n + 1];

        for (int i = 0; i < n; i++) {

            int c = s.charAt(i) - 'a'; // Convert character to index (0 for 'a', 25 for 'z')

            dp[i + 1] = dp[i]; // Default: carry forward previous max count

            // Check all recent positions of character 'c' (up to 4 recent indices)
            for (int j : last[c]) {
                if (i - j + 1 >= 4) { // If substring length is at least 4
                    // Try making a new valid substring from j to i
                    dp[i + 1] = Math.max(dp[i + 1], dp[j] + 1);
                }
            }

            // Add current index i to the deque of character c
            last[c].addLast(i);

            // Keep only the last 4 indices to maintain constraint
            if (last[c].size() > 4) last[c].removeFirst();
        }

        return dp[n]; // Final answer: max number of valid substrings in the whole string
    }
}
