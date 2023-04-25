class SmallestInfiniteSet {
    
    
    TreeSet<Integer> ar;

    public SmallestInfiniteSet() {
        ar=new TreeSet<>();
        
        for(int i=1;i<=1000;i++)
            ar.add(i);
        
    }
    
    public int popSmallest() {
        
//         if(ar.size()==0)
//             for(int i=1;i<=100;i++)
//             ar.add(i);
            
        return ar.pollFirst();
        
        
    }
    
    public void addBack(int num) {
        ar.add(num);
        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */