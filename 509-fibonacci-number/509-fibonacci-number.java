class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int curr = 0, prev1 = 0, prev2 = 1;
        for (int i = 2; i<= n; i++) {
            curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        return curr;
    
    }
}