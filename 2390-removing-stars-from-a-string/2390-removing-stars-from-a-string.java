class Solution {
    public String removeStars(String s) {
        Stack<Character> stack =new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!stack.isEmpty()&&ch=='*')
                stack.pop();
            else
                stack.push(ch);
        }
//         String ns="";
        
//         while(!stack.isEmpty())
//         {
//             ns=stack.pop()+ns;
//         }
//         return(ns);
        StringBuffer res=new StringBuffer();
        while(!stack.isEmpty())
        {
            res.append(stack.pop());
        }
        res.reverse();
        return(res.toString());
        
    }
}