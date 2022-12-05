class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        
        int i,j;
        int counter=(int)Math.pow(2,nums.length);
        List<List<Integer>> finalList=new ArrayList<List<Integer>>();
    List<Integer> a;
        
        for(i=0;i<counter;i++)
        {
            a=new ArrayList<>();
            for(j=0;j<nums.length;j++)
            {
                if((i&(1<<j))!=0)
                    a.add(nums[j]);
                    
                    
            }
            finalList.add(a);
            //a.clear();
            
            
            
        }
        return(finalList);
    }
}