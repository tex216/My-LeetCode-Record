class Solution {
    public int minSteps(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        //given s and t has the same length
        int n = s1.length, ans = 0;
        
        int[] counter = new int[26];
        for (int i = 0; i < n; i++) {
            counter[s1[i] - 'a']++;
            counter[t1[i] - 'a']--;
        }
        
        for (int count : counter) {
            if (count > 0) ans += count;
        }
        
        return ans;
    }
}