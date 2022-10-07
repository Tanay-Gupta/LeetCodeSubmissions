class MedianFinder {

    
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;
    public MedianFinder() 
    {
        left=new PriorityQueue<>(Collections.reverseOrder());
        right=new PriorityQueue<>();   
    }
    
    public void addNum(int num) {
        if(left.size()==0&&right.size()==0)
            left.add(num);
        else if(left.size()>right.size())
        {
            if(left.peek()>num)
            {
                right.add(left.poll());
                left.add(num);
            }
            else
                right.add(num);
        }
        else
        {
            if(left.peek()>=num)
                left.add(num);
            else
            {
                right.add(num);
                left.add(right.poll());
            }
        
        }
        
    }
    
    public double findMedian() {
      if(left.size()==right.size())
          return((double)(left.peek()+right.peek())/2.0);
        else
            return(left.peek());
        
        
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */