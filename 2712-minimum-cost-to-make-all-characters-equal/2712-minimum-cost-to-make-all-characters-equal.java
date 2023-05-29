class Solution {
    public long minimumCost(String s) {
        
        int n=s.length()-1;
        long res=0;
        //gready approach
        // left aur right me kitne fip karne unse me minimum  add kar do
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1))
                res+=Math.min(i+1,n-i);
        }
        return res;
            
        
    }
}