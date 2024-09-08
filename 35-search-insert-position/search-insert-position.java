class Solution {
    public int searchInsert(int[] nums, int target) {

        int n=nums.length;
        int s=0,e=n-1;
        int ans=n;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]>=target)
            {
                ans=m;
                e=m-1;
            }
            else
            s=m+1;
        }
        return ans;
        
    }
}