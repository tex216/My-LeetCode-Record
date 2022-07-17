class Solution(object):
    def maximumUnits(self, boxTypes, truckSize):
        """
        :type boxTypes: List[List[int]]
        :type truckSize: int
        :rtype: int
        """
        boxTypes.sort(key = lambda x: -x[1])
        maxUnit = 0
        for num, unit in boxTypes:
            maxUnit += unit * min(num, truckSize)
            truckSize -= min(num, truckSize)
        return maxUnit
            