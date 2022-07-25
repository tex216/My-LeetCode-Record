class Solution(object):
    def longestPalindrome(self, string):
        """
        :type string: str
        :rtype: str
        """
        ansIdx = [0, 1]
        for i in range(1, len(string)):
            odd = self.getLongestPalindrom(string, i-1, i+1)
            even = self.getLongestPalindrom(string, i-1, i)
            longestIdx = max(odd, even, key=lambda x: x[1] - x[0])
            ansIdx = max(longestIdx, ansIdx, key=lambda x: x[1] - x[0])
        return string[ansIdx[0] : ansIdx[1]]
    
    def getLongestPalindrom(self, string, left, right):
        while left >= 0 and right < len(string):
            if string[left] != string[right]:           
                break
            left -= 1
            right += 1
        return [left + 1, right]
