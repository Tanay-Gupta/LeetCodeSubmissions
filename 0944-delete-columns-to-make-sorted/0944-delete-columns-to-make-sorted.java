class Solution {
    public int minDeletionSize(String[] a) {
        
        
        
        
        int i,j;
        int c=0;
        for(i=0;i<a[0].length();i++)
        {
            for( j=0;j<a.length-1;j++)
            {
               if( a[j].charAt(i)>a[j+1].charAt(i))
               {
                   c++;
                   break;
               }
            }
        }
        return c;
        
        
        
    }
}