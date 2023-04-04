class Solution {
    public boolean isSameAfterReversals(int num) {
        
        
        int x=num;
        StringBuffer br=new StringBuffer(x+"");
        br.reverse();
        x=Integer.valueOf(br.toString());
        System.out.println(x);
        br=new StringBuffer(x+"");
        br.reverse();
         x=Integer.valueOf(br.toString());
        return x==num;
        
    }
}