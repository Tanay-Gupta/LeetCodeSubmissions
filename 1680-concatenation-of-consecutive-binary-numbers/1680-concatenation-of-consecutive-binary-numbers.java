class Solution {
    public int concatenatedBinary(int n) {
        
        
        int mod=(int)(Math.pow(10,9))+7;
        int i,c=0;
        long sum=0;
        for(i=1;i<=n;i++)
        {
            
            
            // long t=i;
            c=0;
            // while(t>0){
            //     t=t>>>1;
            //     c++;
            // }
            c=((int)(Math.log(i)/Math.log(2))+1);
            sum=((sum<<c)+i)%mod;
        }
        return((int)sum%mod);
        
    }
}