class Solution {
    public String breakPalindrome(String s) {
        int length = s.length();
        if (length == 1) return "";
        
        // Strings are immutable, convert into a char array
        char[] arr = s.toCharArray();
        for (int i = 0; i < length / 2; i++) {
            if (arr[i] != 'a') {
                arr[i] = 'a';
                return String.valueOf(arr);
            }
        }
        
        arr[length - 1] = 'b';
        return String.valueOf(arr);
    }
}