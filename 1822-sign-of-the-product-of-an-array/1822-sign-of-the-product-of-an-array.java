class Solution {
    public int arraySign(int[] a) {
        
        
        int c=0;
        for(int i:a)
        {
            if(i==0)
                return 0;
            else if(i<0)
                c++;
        }
        
        if(c%2==0)
            return 1;
        else 
            return -1;
        
    }
}