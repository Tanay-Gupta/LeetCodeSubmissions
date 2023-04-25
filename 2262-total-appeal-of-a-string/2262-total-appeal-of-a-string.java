class Solution {
    public long appealSum(String s) {
        
        
        
        long prev[]=new long[26];
        
        long curr=0,ans=0;
        for(int i=0;i<s.length();i++)
        {
            
            curr+=i+1-(prev[s.charAt(i)-'a']);
            prev[s.charAt(i)-'a']=i+1;// last occurence
            ans+=curr;
        }
        return ans;
        
    }
}
