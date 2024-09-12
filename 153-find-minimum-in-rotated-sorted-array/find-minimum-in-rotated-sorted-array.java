class Solution {
    public int findMin(int[] a) {


        int n=a.length;
        int s=0,e=n-1;
        int min=50001;

        while(s<=e){
                int m=s+(e-s)/2;

                min=Math.min(min,a[m]);

                if(a[m]>=a[e])
                {
                    s=m+1;
                }
                else
                e=m-1;

        }
        return min;
        
    }
}