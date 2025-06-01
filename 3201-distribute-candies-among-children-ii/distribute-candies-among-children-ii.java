class Solution {
    public long distributeCandies(int n, int limit) {
        long c=0;
        int fmin=Math.max(0,n-2*limit);
        int fmax=Math.min(n,limit);
        
        for(int i=fmin; i<=fmax;i++)
        {
            int smin=Math.max(0,n-i-limit);
            int smax=Math.min(limit, n-i);
            c+=smax-smin+1;
        }
        return c;
    }
}