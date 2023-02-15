class Solution {
    public List<Integer> addToArrayForm(int[] a, int k) {
        
        
     List<Integer> ar=new ArrayList<>();
        
        int n=0;
        int i=a.length-1;
        while(i>=0||k>0)
        {
            int x=0;
            if(i>=0)
            x=a[i]+(k%10)+n;
            else if(k>0)
                x=(k%10)+n;
                
            if(x>9)
            {
                n=1;
                x=x%10;
            }
            else
                n=0;
            k=k/10;
            ar.add(0,x);
            
            i--;
            
            
        }
        
        if(n==1)
            ar.add(0,1);
        
        
        return ar;
        
        
        
        
    }
}