class Solution {
    public boolean checkDivisibility(int n) {



        int s=0,p=1,nn=n;

        while(n>0){
            int r=n%10;
            s+=r;
            p*=r;
            n=n/10;
        }
        return (nn%(s+p)==0);
        
    }
}