class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        
        int l=s.length();
        int prev[]=new int[256];
        Arrays.fill(prev,-1);
        int i,j;
        i=0;
int res=0;
        for(j=0;j<l;j++)
        {
            i=Math.max(i,prev[s.charAt(j)]+1);
            int maxEnd=j-i+1;
            res=Math.max(res,maxEnd);
            prev[s.charAt(j)]=j;
        }
        return(res);
        
    }
}