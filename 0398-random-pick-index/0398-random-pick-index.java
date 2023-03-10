class Solution {

    
    HashMap<Integer,ArrayList<Integer>> h=new HashMap<>();
    
    public Solution(int[] nums) {
        
        
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(nums[i]))
            {
                 ArrayList<Integer> ar=h.get(nums[i]);
                ar.add(i);
                h.put(nums[i],ar);
            }
            else
            {
                ArrayList<Integer> ar=new ArrayList<>();
                ar.add(i);
                h.put(nums[i],ar);
            }
        }
        
    }
    
    public int pick(int target) {
        ArrayList<Integer> ar=h.get(target);
          int index = (int)(Math.random() * ar.size());
  
           return ar.get(index);
        
        
        
                

        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */