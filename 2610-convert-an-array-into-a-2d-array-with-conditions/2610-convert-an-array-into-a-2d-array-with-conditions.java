class Solution {
    public List<List<Integer>> findMatrix(int[] a) {
        
        
        List<List<Integer>> list=new ArrayList<>();
        
        
        int c=0;
        while(c!=a.length)
        {
            c=0;
            HashSet<Integer> h=new HashSet<>();
            ArrayList<Integer> ar=new ArrayList<>();
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==-1)
                    c++;
                else if(h.contains(a[i]))
                continue;
                else
                {
                    ar.add(a[i]);
                    h.add(a[i]);
                    a[i]=-1;
                }
            }
            //System.out.println(ar);
            list.add(ar);
  
        }
        list.remove(list.size()-1);
        return list;
        
    }
}