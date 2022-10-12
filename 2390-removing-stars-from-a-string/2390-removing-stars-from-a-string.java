// class Solution {
//     public String removeStars(String s) {
//         Stack<Character> stack =new Stack<>();
        
//         for(int i=0;i<s.length();i++)
//         {
//             char ch=s.charAt(i);
//             if(!stack.isEmpty()&&ch=='*')
//                 stack.pop();
//             else
//                 stack.push(ch);
//         }
//         String ns="";
        
//         while(stack.isEmpty()==false)
//         {
//             ns=stack.pop()+ns;
//         }
//         return(ns);
        
//     }
// }
class Solution {
    public String removeStars(String s) {
        //Creating stack
        Stack<Character> stack =new Stack<Character>();
        for(int i=0;i<s.length();i++){
            //If cuurent character is * and stack is not empty then poping characters from stack 
            if(s.charAt(i)=='*' && !stack.isEmpty()){
                stack.pop();
            }
            //Else pushing character to stack
            else{
                stack.push(s.charAt(i));
            }
        }
        //Creating Stringbuffer
        StringBuffer res=new StringBuffer();
        while(!stack.isEmpty()){
            //Popping the elements and pushing them to o stringbuffer
            res.append(stack.pop());
        }
        //Reversing res
        res.reverse();
        //Returning result by converting stringbuffer to string
        return res.toString();
    }
}