class Solution {
    public double average(int[] a) {
        
        
        Arrays.sort(a);
        int s=0;
       for(int i=1;i<a.length-1;i++)
           s+=a[i];
        
        //System.out.println(s);
        return((s*1.0)/(a.length-2));
        
        
        
    }
}