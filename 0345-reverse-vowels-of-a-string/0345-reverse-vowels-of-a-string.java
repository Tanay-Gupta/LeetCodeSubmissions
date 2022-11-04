class Solution {
    public String reverseVowels(String start) {
        
    char ch[]=start.toCharArray();
        
        int s=0,e=start.length()-1;
        while(s<e)
        {
            
            
            if("AEIOUaeiou".indexOf(ch[s])!=-1&&"AEIOUaeiou".indexOf(ch[e])!=-1)
            {
                char temp=ch[s];
                ch[s]=ch[e];
                ch[e]=temp;
                
                s++;
                e--;
            }
            else if("AEIOUaeiou".indexOf(ch[s])!=-1)
            {
                e--;
            }
            else
                s++;
            
        }
        return(String.valueOf(ch));
        
    }
}