class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            //odd type 
            ans += countPalindrome(s, i, i);
            //even type
            ans += countPalindrome(s, i, i+1);
        }
        return ans;
    }
    
    //expand from center
    private int countPalindrome(String s, int left, int right) {
        int num = 0;
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) break;
            left--;
            right++;
            num++;
        }
        return num;
    }
}