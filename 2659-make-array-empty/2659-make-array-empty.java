class Solution {
    public long countOperationsToEmptyArray(int[] a) {
        
        int n=a.length;
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++)
            map.put(a[i],i);
        long ans=n;
        Arrays.sort(a);
        
        
        /*
        We iterate through the array. Whether we remove an item or move to the next item the cost of the operation is always 1, thus n operations.

When we find an item which index is smaller than the previous, it indicates we have iterated through the entire array and must repeat the previous step again. However this time the lenght of the array is no longer same since some of the items got removed.

The new lenght of the array will be n - number of removed items, thus n - i
        */
        
        
        for(int i=1;i<n;i++)
        {
            if(map.get(a[i])<map.get(a[i-1]))
                ans+=n-i;// here n-i defines the size of remaining array. since we removed some elements
        }
        
        return ans;
        
        
    }
}