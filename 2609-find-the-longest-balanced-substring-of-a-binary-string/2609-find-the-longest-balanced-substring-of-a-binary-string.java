class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        
        int max=0;
        String ns="";
        for(int i=1;i<=s.length()/2;i++)
        {
            ns="0"+ns+"1";
            if(s.indexOf(ns)!=-1)
                max=Math.max(i*2,max);
        }
        return max;
    }
}