class Solution {
    public int longestPalindrome(String[] words) {
        
        
        HashMap<String,Integer> map=new HashMap<>();
        int max=0;
        
        
        for(String i:words)
        {
          String flip=i.charAt(1)+""+i.charAt(0);// reverse of word
          if(map.containsKey(flip))
          {
              max+=4;
              map.put(flip,map.get(flip)-1);//word ke reverse ka count kam kar do
              
              if(map.get(flip)==0)//reverse ka count 0 hua to iska reverse hta do
                  map.remove(flip);
              
          }
          else
            {
                map.put(i,map.getOrDefault(i,0)+1);
            }
            
            
        }
        
        
        
        for(String i:map.keySet())//iterating over hashmap
        {
            if(map.get(i)==1&&((i.charAt(1)+""+i.charAt(0)).equals(i)))
            {
                     max+=2;
            break;
            }
           
        }
        return(max);
        
    }
}