class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll(" ", "").replaceAll("[^a-zA-Z0-9]", "");
        return recIsPalindrome(s, 0, s.length()-1);
    }
    public static boolean recIsPalindrome(String str, int start, int end){
        if(start >= end)  return true;
        if(str.charAt(start) != str.charAt(end))  return false;   
        return recIsPalindrome(str, start+1, end-1);
    }
}