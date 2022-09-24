class Solution {
    public int[] intersection(int[] a, int[] b) {
        
        
        
          HashSet<Integer> h=new HashSet<Integer>();
        ArrayList<Integer> ar=new ArrayList<Integer>();
        int i,c=0;
        for(i=0;i<a.length;i++)
        h.add(a[i]);
        
        for(i=0;i<b.length;i++)
        {
            if(h.contains(b[i]))
            {
                ar.add(b[i]);
                c++;
                 h.remove(b[i]);
           
            }
           
        }
        int ans[]=new int[c];
        for(i=0;i<c;i++)
        {
            ans[i]=ar.get(i);
        }
        return(ans);
    }
}