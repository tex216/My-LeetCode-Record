class Solution {
    public boolean isAnagram(String s, String t) {
        //Method 1: sorting, O(nlogn) time, O(1) space
        //char[] s1 = s.toCharArray();
        //char[] t1 = t.toCharArray();
        //Arrays.sort(s1);
        //Arrays.sort(t1);
        //return Arrays.equals(s1, t1);
        
        //Method 2: frequency counter, O(n) time, O(1) space
        //convert string to char[] to speed up
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int n1 = s1.length, n2 = t1.length;
        if (n1 != n2) return false;
        
        int[] counter = new int[26];
        for (int i = 0; i < n1; i++) {
            counter[s1[i] - 'a']++;
            counter[t1[i] - 'a']--;
        }
        
        for (int count : counter) {
            if (count != 0) return false;
        }
        return true;
        
        //Follow up: What if the inputs contain unicode characters? How would you adapt your solution to such case? 
        // Ans: use HashTable instead of a fixed size array
        
        // HashMap<Character, Integer> map = new HashMap<>();
        //for (int i = 0; i < n; i++) {
        //  map.put(s1[i], map.getOrDefaults(s1[i], 0) + 1);
        //  map.put(t1[i], map.getOrDefaults(t1[i], 0) - 1);
        //}
        //for (char c: map.KeySet()) {
        //  if (map.get(c) != 0) return false;
        //}
        //return true;
    }
}