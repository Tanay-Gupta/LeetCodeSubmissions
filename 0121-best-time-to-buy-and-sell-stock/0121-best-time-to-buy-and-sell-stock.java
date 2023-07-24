class Solution {
    public int maxProfit(int[] a) {
        
        
        int min=a[0];
       
        int res=-1;
        for(int i=1;i<a.length;i++)
        {
            
            
         
            res=Math.max(res,a[i]-min);
            System.out.print(res+" ");
            min=Math.min(a[i],min);
           
            
        }
        return res==-1?0:res;
        
        
    }
}