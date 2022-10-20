class Solution {
    public String intToRoman(int num) {

        
        int a[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String s[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String ss="";
        int i=0;
        while(num>0)
        {
            if(num>=a[i])
            {
                ss=ss+s[i];
                num=num-a[i];
            }
            else
                i++;
            
        }
        return(ss);
    }
}