class Solution {
    
    //similar to combinational sum II
    
    public void walk(int i,int a[],List<List<Integer>> list, List<Integer> ar)
    {
            list.add(new ArrayList<>(ar));
       
       
        
        for(int j=i;j<a.length;j++)
        {
            if(j!=i&&a[j]==a[j-1])continue;
            ar.add(a[j]);
            walk(j+1,a,list,ar);
            ar.remove(ar.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        
       Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        walk(0,nums,list,new ArrayList<>());
        return list;
    
    }
}