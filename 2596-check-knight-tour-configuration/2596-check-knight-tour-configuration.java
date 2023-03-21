class Solution {
    
    
    
    
    boolean isValid=false;
      public void walk(int [][]grid,int i,int j,int prev)
    {
        if(i<0||j<0||i>grid.length-1||j>grid.length-1||grid[i][j]!=prev+1)
            return;
        
        
        if(grid[i][j]==(grid.length*grid.length)-1)
            isValid=true;
        
         int y[]={-2,-2,-1,-1,1,1,2,2};
        int x[]={-1, 1,-2, 2,-2,2,-1,1};
          
          for(int k=0;k<8;k++)
              walk(grid,i+x[k],j+y[k],grid[i][j]);
          
            
    }
  
    public boolean checkValidGrid(int[][] grid) {
        
        
        
        
          walk(grid,0,0,-1);
        return isValid;
        
        
        
    }
}


