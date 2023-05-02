class Solution {
    public long countOperationsToEmptyArray(int[] a) {
        
        int n=a.length;
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++)
            map.put(a[i],i);
        long ans=n;
        Arrays.sort(a);
        for(int i=1;i<n;i++)
        {
            if(map.get(a[i])<map.get(a[i-1]))
                ans+=n-i;// here n-i defines the size of remaining array. since we removed some elements
        }
        
        return ans;
        
        
    }
}