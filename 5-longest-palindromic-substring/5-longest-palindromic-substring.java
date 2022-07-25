class Solution {
    public String longestPalindrome(String str) {
        int[] ansIdx = {0, 1};
        for (int i = 1; i < str.length(); i++) {
            int[] odd = getLongestPalindrom(str, i-1, i+1);
            int[] even = getLongestPalindrom(str, i-1, i);
            int[] longestIdx = (odd[1]-odd[0] > even[1]-even[0]) ? odd : even;
            ansIdx = (ansIdx[1]-ansIdx[0] > longestIdx[1]-longestIdx[0]) ?                          ansIdx : longestIdx;
        }
        return str.substring(ansIdx[0], ansIdx[1]);
    }
    
    public static int[] getLongestPalindrom(String str, int left, int right) {
        while (left >= 0 && right < str.length()) {
            if (str.charAt(left) != str.charAt(right)) {
                break;
            }
            left--;
            right++;
        }
        return new int[] {left + 1, right};
    }
}