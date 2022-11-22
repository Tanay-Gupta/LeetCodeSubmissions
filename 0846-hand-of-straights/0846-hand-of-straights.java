class Solution {
    public boolean isNStraightHand(int[] nums, int k) {
        
        
        
        TreeMap<Integer,Integer> map=new TreeMap<>();
        
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        
        //traversing to elements of treemap and deleting each element till tree map becomes
        
       
        while(map.size()>0)
        {
            int first=map.firstKey();//gives first key of map
            
            for(int i=first;i<first+k;i++)// traveling from first key to till first+k-1
            {
                if(map.containsKey(i)==false)
                    return false;
                else
                {
                    map.put(i,map.get(i)-1);
                    if(map.get(i)==0)
                        map.remove(i);
                }
            }
        }
        return true;
        
    }
}