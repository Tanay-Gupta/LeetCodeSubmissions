class Solution {
    public int[] smallerNumbersThanCurrent(int[] a) {
        
        
        int b[]=new int[a.length];
       
        b=a.clone();
         Arrays.sort(b);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<b.length;i++)
            map.putIfAbsent(b[i],i);
        
        for(int i=0;i<a.length;i++)
        {
            a[i]=map.get(a[i]);
        }
        return a;
        
        
        
        
    }
}