//using lower bound and upper bound concept
class Solution {
    int lower(int a[],int t){

        int n=a.length;
        int s=0,e=n-1;
        int ans=n;
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]>=t)
            {
                ans=m;
                e=m-1;
            }
            else
            s=m+1;
        }
        return ans;
    }
     int upper(int a[],int t){

        int n=a.length;
        int s=0,e=n-1;
        int ans=n;
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]>t)
            {
                ans=m;
                e=m-1;
            }
            else
            s=m+1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {


        int lower=lower(nums,target);
      if(lower==nums.length||nums[lower]!=target)
      return new int[]{-1,-1};

      return new int[]{lower,upper(nums,target)-1};

        
    }
}