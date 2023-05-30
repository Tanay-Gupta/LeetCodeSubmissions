class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs,(x,y)->Integer.compare(x.length(),y.length()));
        
      String  s=strs[0];
        int i=0;
         outer:
        for( i=0;i<s.length();i++)
        {
           
            for(int j=0;j<strs.length;j++)
            {
                if(strs[j].charAt(i)!=s.charAt(i))
                    break outer;
            }
        }
        return s.substring(0,i);
    }
}