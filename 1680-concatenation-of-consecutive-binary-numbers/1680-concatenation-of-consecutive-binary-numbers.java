class Solution {
    public int concatenatedBinary(int n) {
        
        
        int mod=(int)(Math.pow(10,9))+7;
        long i,c=0;
        long sum=0;
        for(i=1;i<=n;i++)
        {
            
            
            long t=i;
            c=0;
            while(t>0){
                t=t>>>1;
                c++;
            }
            sum=((sum<<c)+i)%mod;
        }
        return((int)sum%mod);
        
    }
}