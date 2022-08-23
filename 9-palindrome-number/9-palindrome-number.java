class Solution {
    public boolean isPalindrome(int x) {
        //solve it without converting the integer to a string (no extra space needed)
        
        //edge cases
        if (x < 0) return false;
        if (x == 0) return true;
        
        int reversed = 0, y = x;
        while (y != 0) {
            reversed = reversed * 10 + y % 10;
            y /= 10;
        }
        return reversed == x;
    }
}