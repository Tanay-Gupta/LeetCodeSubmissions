class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
       
        // maximum window size, current window size (unique numbers in the window)
        int maxWindow = 0, window = 0;
        // start and end index of the window
        int start = 0;
        for (int end = 0; end < n; end++) {
            while (start < end && nums[end] - nums[start] >= n) {
                // if duplicate occurs, only count the first appearance into the window
                if (start == 0 || nums[start] != nums[start - 1]) {
                    window--;
                }
                
                start++;
            }
            
            if (start == end || (end > 0 && nums[end] != nums[end - 1])) {
                window++;
            }
            
            maxWindow = Math.max(maxWindow, window);
        }
        
        return n - maxWindow;
    }
}