class StockSpanner {

    ArrayDeque<int[]> ar;
    public StockSpanner() {
        
        ar=new ArrayDeque<>();
  
    }
    
    public int next(int price) {
        
        int span=1;
        while(!ar.isEmpty()&&ar.peek()[0]<=price)
        {
            span+=ar.pop()[1];
        }
        ar.push(new int[]{price,span});
        return(span);
        
        
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */