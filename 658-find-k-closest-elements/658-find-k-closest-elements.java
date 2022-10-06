class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int i;
        for(i=0;i<k;i++)
            pq.add(arr[i]);
        
        for(i=k;i<arr.length;i++)
        {
            int z=pq.peek();
            //System.out.println(z);
            // System.out.print( Math.abs(z-x)+" ");
            //  System.out.println( Math.abs(x-arr[i]));
            
            if(Math.abs(z-x)>Math.abs(x-arr[i]))
            {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        
        ArrayList<Integer> ar=new ArrayList<>();
        for(i=0;i<k;i++)
            ar.add(pq.poll());
        return(ar);
        
        
    }
}