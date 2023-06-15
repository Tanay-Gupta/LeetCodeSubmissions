class Solution {
    public boolean onLine(int[] p1, int[] p2, int[] p3){
        int x = p1[0], y = p1[1], x1 = p2[0], y1 = p2[1], x2 = p3[0], y2 = p3[1];
        return ((y - y1) * (x2 - x1) == (y2 - y1) * (x - x1));
    }
    public boolean checkStraightLine(int[][] a) {
       
		
        for(int i=2;i<a.length;i++){
            if(!onLine(a[i], a[0], a[1]))
                return false;
        }
        return true;
    }
}