class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            //string is immutable, to sort word, it has to be converted to charArray then convert back
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            
            if (map.containsKey(sortedWord)) {
                map.get(sortedWord).add(word);
            }
            else {
                map.put(sortedWord, new ArrayList<String>                                                               (Arrays.asList(word)));
            }
        }
        return new ArrayList<List<String>>(map.values());
    }
}