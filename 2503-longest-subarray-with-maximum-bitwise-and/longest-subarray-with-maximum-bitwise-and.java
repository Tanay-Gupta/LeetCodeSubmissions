class Solution {
    public int longestSubarray(int[] a) {
        
          
       int max=Arrays.stream(a).max().getAsInt();
       int c=0;
        int len=1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==max)
                c++;
            else
            {
                len=Math.max(len,c);
                c=0;
            }
        } len=Math.max(len,c);
        return(len);
            
        
    }
}