class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> map = new HashMap<>();

        // iterate through each string
        for (String s : strs) {
            char[] chars = s.toCharArray();     // convert string to char array
            Arrays.sort(chars);                 // sort characters alphabetically
            String key = new String(chars);     // create string from sorted chars

            // if key not present, initialize new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // add the original string to the corresponding group
            map.get(key).add(s);
        }

        // return all grouped anagrams as a list of lists
        return new ArrayList<>(map.values());

    }
}