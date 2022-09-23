class Solution {
    public int countNegatives(int[][] grid) {
        
        
        
        int i,count=0;
        for(i=0;i<grid.length;i++)
        {
            int s,l;
            s=0;l=grid[0].length-1;
            while(s<=l)
            {
               int m=s+(l-s)/2;
                
               if(grid[i][m]>=0)
                   s=m+1;
               else
                   l=m-1; 
            }
            count+=grid[i].length-1-l;
            
            
        }
        return(count);
            
        
        
        
        
    }
}