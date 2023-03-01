class Solution {
    public int numSpecialEquivGroups(String[] words) {
        
        
        
        
     HashSet<String> h=new HashSet<>(); 
     for(String i:words)
     {
         
         
         int even[]=new int[26];
         int odd[]=new int[26];
         for(int j=0;j<i.length();j++)
         {
             if(j%2==0)
                 even[i.charAt(j)-'a']++;
             else
                 odd[i.charAt(j)-'a']++;
         }
         h.add(Arrays.toString(even)+Arrays.toString(odd));
     }
        
        return h.size();
        
        
        
        
    }
}