class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        int n=heights.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        int i;
        for(i=0;i<heights.length;i++)
        {
            h.put(heights[i],i);
}
        Arrays.sort(heights);
        String s[]=new String[heights.length];
        for(i=0;i<heights.length;i++)
            s[i]=names[h.get(heights[n-i-1])];
            
        return(s); 
    }
   
}