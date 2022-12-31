class Solution {
    
    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    
    public int subarrayLCM(int[] nums, int k) {
        
           int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int currGCD = nums[i];

            for (int j = i; j < n; j++) {
                currGCD = (currGCD*nums[j])/gcd(currGCD, nums[j]);
                if(currGCD>k)break;
                ans += (currGCD == k) ? 1 : 0;
                
            }
        }

        return ans;
               
      
        
        
    }
}