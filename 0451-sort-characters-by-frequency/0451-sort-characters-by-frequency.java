class Solution {
    public String frequencySort(String s) {
        
        
        
        
        int l=s.length();
        
      
        
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<l;i++)
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(map.entrySet());
        
        StringBuffer br=new StringBuffer();
        
        while(!pq.isEmpty())
        {
            Map.Entry e=pq.poll();
           for (int i = 0; i < (int)e.getValue(); i++) 
                br.append(e.getKey());
        }
        
    return br.toString();
    }
}



