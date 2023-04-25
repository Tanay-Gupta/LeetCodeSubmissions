class Solution {
    public long appealSum(String s) {
        //https://assets.leetcode.com/users/images/96c9f2ad-4378-461a-bcf0-3dd9596765be_1651377614.4588175.png
        
        
        long prev[]=new long[26];
        
        long curr=0,ans=0;
//         for(int i=0;i<s.length();i++)
//         {
            
//             curr+=i+1-(prev[s.charAt(i)-'a']);
//             prev[s.charAt(i)-'a']=i+1;// last occurence
//             ans+=curr;
//         }
        Arrays.fill(prev,-1);
         for(int i=0;i<s.length();i++){
            prev[s.charAt(i)-'a']=i;
            for(int  j=0;j<26;j++) ans+=(prev[j]+1);
        }
        return ans;
        
    }
}
