class Solution(object):
    def findBuildings(self, heights):
        """
        :type heights: List[int]
        :rtype: List[int]
        """
        ans = []
        maxHeight = 0
        for idx in reversed(range(len(heights))):
            if heights[idx] > maxHeight:
                ans.append(idx)
                maxHeight = heights[idx]
        return ans[::-1] ## or ans.reverse()