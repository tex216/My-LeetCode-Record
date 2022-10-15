class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        //use char[] to speed up
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        int n1 = t1.length, n2 = t2.length;
        //create dp table, default value is 0
        int[][] dp = new int[n1 + 1][n2 + 1];
        //main logic
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (t1[i-1] == t2[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n1][n2];
    }
}