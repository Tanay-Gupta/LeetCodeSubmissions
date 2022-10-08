class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        
        
        Arrays.sort(boxTypes,(a,b)->(-1*Integer.compare(a[1],b[1])));
        
        int sum=0;
        int cap=0;
        
        // for(int i=0;i<boxTypes.length;i++)
        //     System.out.print(boxTypes[i][1]+" ");
        for(int i=0;i<boxTypes.length;)
        {
            if(cap==truckSize)
                break;
            
            sum=sum+boxTypes[i][1];
            boxTypes[i][0]--;
            if( boxTypes[i][0]==0)
                i++;
            cap++;
            
        }
     
        return(sum);
    }
}