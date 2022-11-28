class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        //precomputing the no of ones in a row and column
        int rowone[]=new int[grid.length];
        int colone[]=new int[grid[0].length];
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)c++;
            }
            rowone[i]=c;
        }
        for(int i=0;i<n;i++){
          int c=0;
            for(int j=0;j<m;j++){
                if(grid[j][i]==1)c++;
            }
            colone[i]=c;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=rowone[i]+colone[j]-(m-rowone[i])-(n-colone[j]);
            }
        }
        return grid;
    }
}
