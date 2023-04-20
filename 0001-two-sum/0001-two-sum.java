class Solution {
    public int[] twoSum(int[] a, int t) {
        
        
      
        HashMap<Integer,Integer> h=new HashMap<>();
        
        for(int i=0;i<a.length;i++)
        {
            if(h.containsKey(t-a[i])==true)
                return(new int[]{i,h.get(t-a[i])});
            h.put(a[i],i);
        }
        return new int[2];
    }
}