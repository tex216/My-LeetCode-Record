class Solution(object):
    def maxDepth(self, s):
        """
        :type s: str
        :rtype: int
        """
        ans, curr = 0, 0
        for c in s:
            if c == '(':
                curr += 1
                ans = max(ans, curr)
            if c == ')':
                curr -= 1
        return ans