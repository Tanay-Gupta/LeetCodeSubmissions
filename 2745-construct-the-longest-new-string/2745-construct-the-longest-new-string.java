class Solution {
    public int longestString(int aa, int bb, int ab) {
        
        
        
        
        if(aa==bb)
            return (aa+bb+ab)*2;
        else
            return (Math.min(aa,bb)*4+2+ab*2);
        
        
        
        
    }
}