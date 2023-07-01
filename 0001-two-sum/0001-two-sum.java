class Solution {
    public int[] twoSum(int[] a, int t) {
        
        
        
        
        HashMap<Integer,Integer> h=new HashMap<>();
        int i;
        for( i=0;i<a.length;i++)
        {
            
            if(h.containsKey(t-a[i])==true)
                break;
            
            // System.out.println(a[i]+" "+(t-a[i]));
            h.put(a[i],i);
        }
        return(new int[]{i,h.get(t-a[i])});
    
        
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    