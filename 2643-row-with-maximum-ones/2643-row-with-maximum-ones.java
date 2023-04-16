class Solution {
    public int[] rowAndMaximumOnes(int[][] a) {
        
        
        int index=0;
        int max=(int)-1e9;
        
        for(int i=0;i<a.length;i++)
        {
            int c=0;
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==1)
                    c++;
            }
            if(c>max)
            {
                index=i;
                max=c;
            }
        }
        //int b[]={index,max};
        return new int[]{index,max};
        
    }
}