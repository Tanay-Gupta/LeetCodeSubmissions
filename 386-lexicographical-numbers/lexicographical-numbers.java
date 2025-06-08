class Solution {
    public List<Integer> lexicalOrder(int n) {
        
        TreeSet<String> ar=new TreeSet<>();
        
        for(int i=1;i<=n;i++)
            ar.add(i+"");
        
        List<Integer> arr=new ArrayList<>();
        
        for(String i:ar)
            arr.add(Integer.valueOf(i));
        return arr;
        
        
        
        
    }
}