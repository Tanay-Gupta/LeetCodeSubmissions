class Solution {
    
    //similar to combinational sum II
    
    public void walk(int i,int a[],Set<List<Integer>> list, List<Integer> ar)
    {
        if(i==a.length)
        {
            list.add(new ArrayList<>(ar));
            return;
        }
        
        ar.add(a[i]);
        walk(i+1,a,list,ar);
        ar.remove(ar.size()-1);
        walk(i+1,a,list,ar);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        
        Arrays.sort(nums);
        Set<List<Integer>> list=new HashSet<>();
        walk(0,nums,list,new ArrayList<>());
        List<List<Integer>> list1=new ArrayList<>(list);
        
        
        return list1;
    
    }
}