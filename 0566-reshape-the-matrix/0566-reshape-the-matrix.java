class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        
        int row=mat.length;
        int column=mat[0].length;
        if(row*column!=r*c)
            return(mat);
        else
        {
            
            int a[][]=new int[r][c];
            int x,y;
            x=y=0;
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                     
                    if(y>=column)
                    {
                      y=0;
                        x++;
                    }
                        
                    a[i][j]=mat[x][y++];
                   
                }
            }
            return(a);
        }
    }
}