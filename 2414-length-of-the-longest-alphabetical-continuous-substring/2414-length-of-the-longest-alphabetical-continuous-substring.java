class Solution {
    public int longestContinuousSubstring(String s) {
        
        int l=s.length();
           
     int c=1;
        int j=1;
        int max=1;
        while(j<l)
        {
            if(s.charAt(j)-s.charAt(j-1)==1)
            {
                c++;
                j++;
            }
            else
            {
                
                c=1;
                j++;
            }
            max=Math.max(max,c);
        }
         // max=Math.max(max,c);
        return(max);
    }
}