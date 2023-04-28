class Solution {
    public int countVowelStrings(int n) {
        
        
        
        int a,e,i,o,u;
        
        a=e=i=o=u=1;
        while(--n>0)
        {
            o=o+u;
            i=i+o;
            e=e+i;
            a=a+e;
            
        }
        return (a+e+i+o+u);
        
        
    }
}