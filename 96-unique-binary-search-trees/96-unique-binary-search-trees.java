class Solution {
    
   
    public int numTrees(int n) {
        long cat_ = 1;
 
        
        // Iterate till N
        for (int i = 1; i <= n; i++) {
          
            cat_ *= (4 * i - 2);
            cat_ /= (i + 1);
          
        }
        return((int)cat_);
        
    }
}