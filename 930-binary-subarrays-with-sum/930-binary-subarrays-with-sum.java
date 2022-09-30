class Solution {
    public int numSubarraysWithSum(int[] a, int sum) {
          HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
     int max=0,s=0,i;
     
     for(i=0;i<a.length;i++)
     {
         s=s+a[i];
         if(s==sum)
         {
            max++;
         }
         if(map.containsKey(s-sum))
         {
            max+=map.get(s-sum);
             
         }
         
         map.put(s,map.getOrDefault(s,0)+1);
         
     }
    return(max);
        
    }
        
    
}