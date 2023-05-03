class Solution {
    public List<Integer> intersection(int[][] b) {
        
        
     
        int a[]=new int[1001];
        
        for(int i=0;i<b.length;i++)
        {
            for(int j:b[i])
             a[j]++;
        }
        
        List<Integer> ar=new ArrayList<>();
        for(int i=0;i<1001;i++)
        {
            if(a[i]==b.length)
                ar.add(i);
        }
        return ar;
    }
}