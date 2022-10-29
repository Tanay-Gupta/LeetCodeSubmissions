class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        int l2=nums2.length;
       
        for(int i=l2-1;i>=0;i--)
        {
           
            
            while(s.isEmpty()==false&&s.peek()<nums2[i])
                s.pop();
            if(s.isEmpty())
             map.put(nums2[i],-1);
            else
             map.put(nums2[i],s.peek());
            
             s.add(nums2[i]);
                
        }
        int a[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            a[i]=map.get(nums1[i]);
        }
        return(a);
        
    }
}