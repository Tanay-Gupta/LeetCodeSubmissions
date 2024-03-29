class Solution {
    
    
    
   public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return Collections.emptyList();
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            int[] frequencyArr = new int[128];   
            for(int i = 0;i<s.length();i++){
                frequencyArr[s.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(frequencyArr);
            List<String> tempList = map.getOrDefault(key, new LinkedList<String>());
            tempList.add(s);
            map.put(key,tempList);
        }
        return new LinkedList<>(map.values());
    }
}