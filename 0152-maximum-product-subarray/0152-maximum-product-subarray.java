class Solution {
    public int maxProduct(int[] a) {
        
          
//         int max=a[0];
//         int ans=a[0];
        
//         for(int i=1;i<a.length;i++)
//         {
//             max=Math.max(a[i],max*a[i]);// issue with this code is that it fails for [-2,3,-4]
//             ans=Math.max(max,ans);
//         }
//         return ans;
         
        
        int l=a.length;
        int start,end;
        start=end=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<l;i++)
        {
            start*=a[i];
            end*=a[l-1-i];
            max=Math.max(max,Math.max(start,end));
            if(start==0) start=1;
            if(end==0) end=1;
                
        }
        return max;
    }
}