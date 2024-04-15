class Solution {
    public int minRectanglesToCoverPoints(int[][] A
    , int w) {


        Arrays.sort(A,(a,b)->a[0]-b[0]);
        int ans=0, last=-1;

        for(int a[]:A){

            if(a[0]>last) {
                ans++;
                last=a[0]+w;
            }
        }
        return ans;
        
    }
}