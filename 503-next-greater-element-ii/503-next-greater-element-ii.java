
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
   
             
        Stack<Integer> s=new Stack<>();
        int a[]=new int[nums.length];
        a[nums.length-1]=-1;
        int index=-1;
                int i;

       for( i=nums.length-1;i>=0;i--){
            s.push(nums[i]);
        } 
        
        int x=nums.length-1;
    
        for(i=nums.length-1;i>=0;i--)
        {
            while(!s.isEmpty()&&s.peek()<=nums[i])
                s.pop();
           // System.out.print(s.isEmpty());
            a[x--]=s.isEmpty()?-1:s.peek();
            s.push(nums[i]);
            
        }
        
        return(a);
        
        
    }
}