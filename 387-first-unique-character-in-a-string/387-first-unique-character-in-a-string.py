class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        dict = {}
        for c in s:
            if c not in dict:
                dict[c] = 0
            dict[c] += 1
        
        for index, c in enumerate(s):
            if dict[c] == 1:
                return index
        return -1
            
            