class Solution {
    public int maxProfit(int[] a) {

        int l=a.length;
        int currmin=Integer.MAX_VALUE;
        int profit=Integer.MIN_VALUE;
        for(int i=0;i<l;i++){
          
           if(a[i]<currmin) currmin=a[i];

           if(a[i]> currmin){
            profit=Math.max(profit,a[i]-currmin);
           }
        }
        return profit==Integer.MIN_VALUE?0:profit;
        
    }
}