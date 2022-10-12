class Solution {
    
    HashMap<Integer,HashSet<Integer>> h=new HashMap<>();
    public boolean can(int curr, int k,int last)
    {
     if(curr==last)
         return(true);// this means we have reached to the end
        
        
     if(k<=0||h.get(curr).contains(k)) // no more traversal possible or already traversed
         return(false);
     int next=curr+k;
     
        if(h.containsKey(next))
        {
            if(can(next,k-1,last)||can(next,k,last)||can(next,k+1,last))
                return(true);
        }
        
        h.get(curr).add(k);
        return(false);
        
        
       
    }
    public boolean canCross(int[] stones) {
        
        for(int i=0;i<stones.length;i++)
            h.put(stones[i],new HashSet<>());
        
        
        return(can(0,1,stones[stones.length-1]));
        
        
        
        
        
    }
}