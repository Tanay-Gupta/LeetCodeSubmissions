class Solution {
    
    
    
    public void walk(List<List<Integer>> list,ArrayList<Integer> ar,Set<Integer> set,int nums[] )
    {
        if(ar.size()==nums.length){
            list.add(new ArrayList<>(ar));
            return;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(i))
            {
                ar.add(nums[i]);
                set.add(i);
                walk(list,ar,set,nums);
                ar.remove(ar.size()-1);
                set.remove(i);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> list=new ArrayList<>();
        walk(list,new ArrayList<>(),new HashSet<>(),nums);
        return list;
        
        
    }
}