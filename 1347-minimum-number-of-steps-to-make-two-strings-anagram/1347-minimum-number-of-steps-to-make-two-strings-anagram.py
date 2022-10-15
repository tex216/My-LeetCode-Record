class Solution(object):
    def minSteps(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: int
        """
        count, ans = Counter(s), 0
        for c in t:
            if count[c] > 0:
                count[c] -= 1
            else:
                ans += 1
        return ans;