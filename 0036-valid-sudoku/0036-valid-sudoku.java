class Solution {
    public boolean isValidSudoku(char[][] a) {
        
        HashSet<String> h=new HashSet<>();
        
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                
                char ch=a[i][j];
                if(ch!='.')
                {
                    if(!h.add(ch+ " in row " + i) ||
                       !h.add(ch+ " in column " + j)||
                       !h.add(ch + " in block " + i/3 + "-" + j/3))
                    return false;
                }
            }
        }
        return true;
        
    }
}