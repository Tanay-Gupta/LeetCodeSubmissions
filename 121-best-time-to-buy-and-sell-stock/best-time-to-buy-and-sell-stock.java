class Solution {
    public int maxProfit(int[] a) {
        
         int min=a[0],max=0;
        for( int i=1;i<a.length;i++){


            max=Math.max(max,a[i]-min);
            min=Math.min(min,a[i]);

        }
        return max;
    }
}