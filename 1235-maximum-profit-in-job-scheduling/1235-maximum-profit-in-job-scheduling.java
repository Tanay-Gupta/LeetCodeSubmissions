class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        
        
        int a[][]=new int[startTime.length][];
        int i;
        for(i=0;i<startTime.length;i++)
        {
            a[i]=new int[]{startTime[i],endTime[i],profit[i]};
        }
        Arrays.sort(a,(x,y)->Integer.compare(x[1],y[1]));
        
        TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
        map.put(0,0);
        int res=0;
        for(i=0;i<startTime.length;i++)
        {
            int curr=map.floorEntry(a[i][0]).getValue()+a[i][2];
            if(curr>res)
                map.put(a[i][1],res=curr);
            
        }
        return(res);
        
    }
}