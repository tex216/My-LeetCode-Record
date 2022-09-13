class Solution(object):
    def coinChange(self, coins, n):
        """
        :type coins: List[int]
        :type amount: int
        :rtype: int
        """
        ans = [float("inf") for amount in range(n+1)]
        ans[0] = 0
        for deno in coins:
            for amount in range(len(ans)):
                if deno <= amount:
                    ans[amount] = min(ans[amount], ans[amount - deno] + 1)
        return ans[n] if ans[n] != float("inf") else -1