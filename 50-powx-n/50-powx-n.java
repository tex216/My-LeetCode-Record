class Solution {
    public double myPow(double x, int n) {
        //Correct but Time Limit Excess
        // double ans = 1;
        // for (int i = 1; i <= Math.abs(n); i++) {
        //        ans = ans * x;
        // }
        // return (n >= 0) ? ans : 1/ans;
        
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ans = 1;
        double current_product = x;
        for (long i = N; i > 0; i /= 2) {
            if ((i % 2) == 1) {
                ans = ans * current_product;
            }
            current_product = current_product * current_product;
        }
        return ans;
    }
}