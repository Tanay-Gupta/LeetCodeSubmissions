class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        

        long ans=(long)nums.length;
        int curr=0;
        for(int i=0;i<nums.length-1;i++){

            if(nums[i]!=nums[i+1]) curr++;
            else curr=0;

            ans+=curr;
        }
        return ans;
    }
}