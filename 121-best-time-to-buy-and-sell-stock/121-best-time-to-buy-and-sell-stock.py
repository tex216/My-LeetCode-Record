class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        min = prices[0]
        profit = 0
        for i in range(1, len(prices)):
            if prices[i] < min:
                min = prices[i]
            max = prices[i] - min
            if max > profit:
                profit = max
        return profit
                