class Solution {
    
    public int findMaxHisto(int a[],int n)//function to find largest histogram in a array
    {
        Stack<Integer> stack=new Stack<>();
        int res=0,curr=0;
        int i;
        for(i=0;i<n;i++)
        {
            while(!stack.isEmpty()&&a[stack.peek()]>=a[i])
            {
              int   tb=stack.pop();
                curr=a[tb]*(stack.isEmpty()?i:i-stack.peek()-1);
                res=Math.max(res,curr);
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
               int tb=stack.pop();
                curr=a[tb]*(stack.isEmpty()?n:n-stack.peek()-1);
                res=Math.max(res,curr);
            
        }
        return(res);
        
    }
    public int maximalRectangle(char[][] a) {
        
        int[][] matrix=new int[a.length][a[0].length];
        for(int x=0;x<a.length;x++)
        {
            for(int y=0;y<a[0].length;y++)
            {
                if(a[x][y]=='1')
                    matrix[x][y]=1;
                else
                    matrix[x][y]=0;
            }
                
        }
        
        int res=findMaxHisto(matrix[0],matrix[0].length);
        int i;
        
        for(i=1;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==1)
                {
                    matrix[i][j]+=matrix[i-1][j];
                }
                    
            }
            res=Math.max(res,findMaxHisto(matrix[i],matrix[i].length));
        }
        return(res);
        
        
        
    }
}