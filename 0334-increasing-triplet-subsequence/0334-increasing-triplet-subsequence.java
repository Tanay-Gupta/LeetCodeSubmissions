class Solution {
    public boolean increasingTriplet(int[] a) {
        
   
        int l=a.length-1;
        if(l<2)
            return(false);
       
        
        int sm,mid;
        sm=mid=Integer.MAX_VALUE;
        for(int i:a){
            
            if(i<=sm)
                sm=i;
            else if(i<=mid)
                mid=i;
            else
            {
               // System.out.println("sm="+sm+" mid="+mid+" "+i); 
                return(true);
            }
               
        }
        return(false);
        
    }
}