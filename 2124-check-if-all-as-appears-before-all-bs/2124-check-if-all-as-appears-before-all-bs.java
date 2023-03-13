class Solution {
    public boolean checkString(String s) {
        
        int a=s.lastIndexOf('a');
        
        s=s.substring(0,a+1);
        if(s.indexOf('b')==-1)
            return true;
        else
            return false;
        
        
        
    }
}