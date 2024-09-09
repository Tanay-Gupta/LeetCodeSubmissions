//using first and last occu
class Solution {
   
    int first(int a[],int t){

        int n=a.length;
        int s=0,e=n-1;
        int ans=-1;
        while(s<=e){
            int m=s+(e-s)/2;

            if(a[m]==t){

                ans=m;
                e=m-1;
            }
            else if(a[m]>t)
            e=m-1;
            else
            s=m+1;
        }
        return ans;
    } 
     int last(int a[],int t){

        int n=a.length;
        int s=0,e=n-1;
        int ans=-1;
        while(s<=e){
            int m=s+(e-s)/2;

            if(a[m]==t){

                ans=m;
               s=m+1;
            }
            else if(a[m]>t)
            e=m-1;
            else
            s=m+1;
        }
        return ans;
    }  
    public int[] searchRange(int[] nums, int target) {
    

      int first=first(nums,target);
      if(first==-1) return new int[]{-1,-1};

      return new int[]{first,last(nums,target)};
        
    }
}