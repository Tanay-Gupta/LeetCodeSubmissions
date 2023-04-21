class Solution {
    public int twoCitySchedCost(int[][] a) {
        
        
        
        int n=a.length;
        Arrays.sort(a,(x,b)->{
            return ((x[0]-x[1])-(b[0]-b[1]));//sorting based on difference
        });
        
        //jitni negative value means utni badi B wali cost
        //so we will take A
        // and for rest of the values we will take B kyoki udhar A bada h.
        
        int cost=0;
        for(int i=0;i<n/2;i++)
        {
            cost+=a[i][0] + a[i+(n/2)][1];
        }
        return cost;
        
        
    }
}