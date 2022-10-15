class Solution {
    public int minSteps(String s, String t) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--; //compute difference between s and t
        }
        
        int ans = 0;
        for (int c : count) {
            if (c > 0) ans += c;
        }
        return ans;
    }
}