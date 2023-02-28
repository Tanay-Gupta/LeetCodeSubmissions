class Solution {
    public int smallestRepunitDivByK(int k) {
        
        int value=0;
        for(int i=1;i<=k;i++)
        {
             value=((value)*10+1)%k;
            if(value==0)
                return i;
            
        }
        return -1;
        
    }
}