class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {

      if(x==0) return 0;
      int n=x;
      int s=0;
       while(x>0) {
        s+=x%10;
         x=x/10;
       }

       if(n%s==0) return s;
       else return -1;
        
    }
}