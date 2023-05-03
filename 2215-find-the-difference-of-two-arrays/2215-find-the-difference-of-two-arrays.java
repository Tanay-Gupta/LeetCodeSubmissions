class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        
        HashSet<Integer> a=new HashSet<>();
        HashSet<Integer> b=new HashSet<>();
        List<List<Integer>> ar=new ArrayList<>();
        ar.add(new ArrayList<>());
         ar.add(new ArrayList<>());
        
        for(int i:nums1)
            a.add(i);
        
        for(int i:nums2)
            b.add(i);
        
        
        
        
        for(int i:a)
            if(!b.contains(i)) ar.get(0).add(i);
        for(int i:b)
            if(!a.contains(i)) ar.get(1).add(i);
        return ar;
        
    }
}