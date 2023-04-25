class Solution {
    public int uniqueLetterString(String s) {
        
        
        
//          for(int i=0;i<n;i++){
//             secondLstOccurence[s[i]-'A']=lstOccurence[s[i]-'A'];
//             lstOccurence[s[i]-'A']=i;
//             for(int j=0;j<26;j++){
//                 ans+=(lstOccurence[j]-secondLstOccurence[j]);
//             }
//         }
        
          long prev[]=new long[26];
          long prev2[]=new long[26];
        long curr=0,ans=0;
       Arrays.fill(prev,-1);
         Arrays.fill(prev2,-1);
         for(int i=0;i<s.length();i++){
             prev2[s.charAt(i)-'A']= prev[s.charAt(i)-'A'];
            prev[s.charAt(i)-'A']=i;
             
            for(int j=0;j<26;j++){
                ans+=(prev[j]-prev2[j]);
            }
        }
        return (int)ans;
        
    }
}