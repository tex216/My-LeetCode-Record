class Solution {
    public int minSteps(String s, String t) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            ++count[c - 'a'];
        }
        
        int ans = 0;
        for (char c : t.toCharArray()) {
            if (count[c - 'a'] > 0) --count[c - 'a'];
            else ans++;
        }
   
        return ans;
    }
}