class Solution {
    public boolean checkIfPangram(String s) {
        int a[]=new int[26];
        int i;
        
        for(i=0;i<s.length();i++)
            a[s.charAt(i)-'a']++;
        for(i=0;i<26;i++)
        {
            if(a[i]==0)
                return(false);
        }
        return(true);
    }
}