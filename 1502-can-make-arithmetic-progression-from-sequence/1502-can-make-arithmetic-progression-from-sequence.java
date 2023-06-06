class Solution {
    public boolean canMakeArithmeticProgression(int[] a) {
        
        Arrays.sort(a);
        if(a.length==2)
            return true;
        for(int i=1;i<a.length-1;i++)
        {
            if(a[i+1]-a[i]!=a[i]-a[i-1])
                return false;
        }
        return true;
    }
}