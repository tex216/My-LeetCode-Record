class Solution {
    public int removePalindromeSub(String s) {
        //the subsequence does not need to be consecutive 
        if (s.isEmpty()) return 0;
        if (isPalindrome(s)) return 1;
        return 2;
    }
    
    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}