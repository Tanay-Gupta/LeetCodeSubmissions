class Solution {
    public int minNumberOperations(int[] a) {



     int sum=a[0];
     for(int i=1;i<a.length;i++){
        sum+=Math.max(a[i]-a[i-1],0);
     }
     return sum;

        
    }
}