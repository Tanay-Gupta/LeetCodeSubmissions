class Solution {
    public int maxProduct(int[] a) {
        
        
        
        int l=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>l)
                
            {
                sl=l;
                l=a[i];
            }
            else if(a[i]>sl)
                sl=a[i];
        }
        return((sl-1)*(l-1));
        
    }
}