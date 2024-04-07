class Solution {
    public int longestMonotonicSubarray(int[] a) {


        int inc=1,dec=1;
        int ans=1;

        for(int i=1;i<a.length;i++){


            if(a[i]>a[i-1])
            {
                inc++;
                dec=1;
            }
            else if(a[i]<a[i-1])
            {
                dec++;
                inc=1;
            }
            else
            {
                inc=dec=1;
            }
            ans=Math.max(ans,Math.max(inc,dec));
        }
        return ans;
        
    }
}