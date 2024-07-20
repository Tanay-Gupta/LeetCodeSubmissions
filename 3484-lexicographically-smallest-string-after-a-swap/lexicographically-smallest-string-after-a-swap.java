class Solution {
    public String getSmallestString(String s) {

       char ch[]=s.toCharArray();

       for(int i=0;i<s.length()-1;i++){
        if(ch[i]%2==ch[i+1]%2 && ch[i]>ch[i+1])
        {
            char t=ch[i+1];
            ch[i+1]=ch[i];
            ch[i]=t;
            break;
        }
       }

       return new String(ch);
        
    }
}