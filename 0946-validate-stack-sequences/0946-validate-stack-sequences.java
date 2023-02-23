class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        
        
        
        
        Stack<Integer> s=new Stack<>();
        int i=0;
        int j=0;
        
        while(i<pushed.length&&j<popped.length)
        {
            s.add(pushed[i++]);
            while(s.isEmpty()==false&&s.peek()==popped[j])
            {
                s.pop();
                j++;
            }
        }
        
        return(s.isEmpty());
        
    }
}