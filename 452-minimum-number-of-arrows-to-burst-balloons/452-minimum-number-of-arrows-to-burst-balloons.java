class Solution {
    public int findMinArrowShots(int[][] points) {
        
        
//         Arrays.sort(points,new Comparator<int[]>(){
            
            
//              public int compare(final int a[],final int b[])
//             {
//                 return(a[1]>b[1]?1:-1);
//             }
//         });
         Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        
        int i;
        int count=1;
        int prev=points[0][1];
        for(i=1;i<points.length;i++)
        {
            if(points[i][0]>prev)
            {
                count++;
                prev=points[i][1];
            }
               
        }
        return(count);
        
    }
}