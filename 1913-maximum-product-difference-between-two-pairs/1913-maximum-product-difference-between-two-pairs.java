class Solution {
    public int maxProductDifference(int[] a) {
        Arrays.sort(a);
        
        int l=a.length;
        
        return(a[l-1]*a[l-2]-a[0]*a[1]);
        
    }
}