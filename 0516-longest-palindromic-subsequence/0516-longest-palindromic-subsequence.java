class Solution {
    public int longestPalindromeSubseq(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        
        if (arr == null || n == 0) return 0;
        if (n == 1) return 1;
        
        int[][] dp = new int[n + 2][n + 2];
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (arr[i-1] == arr[j-1]) {
                    dp[i][j] = dp[i-1][j+1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j+1]);
                }
            }
        }
        return dp[arr.length][1];
        
    }
}