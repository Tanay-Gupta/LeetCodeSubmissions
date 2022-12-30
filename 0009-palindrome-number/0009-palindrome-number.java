class Solution {
    public boolean isPalindrome(int x) {
        
        
        String s=""+x;
        int start=0,end=s.length()-1;
        while(start<end)
        {
            char a=s.charAt(start);
            char b=s.charAt(end);
            if(a!=b)
                return(false);
            start++;
            end--;
        }
        return(true);
        
        
    }
}