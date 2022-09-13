class Solution {
    public int coinChange(int[] coins, int n) {
        int[] ans = new int[n+1];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[0] = 0;
        for (int deno : coins) {
          for (int amount = 0; amount < n + 1; amount++) {
            if (deno <= amount) {
              if (ans[amount - deno] != Integer.MAX_VALUE) {
              ans[amount] = Math.min(ans[amount], ans[amount - deno] + 1);
              }
            }
          }
        }
        return (ans[n] != Integer.MAX_VALUE) ? ans[n] : -1;
      }
}