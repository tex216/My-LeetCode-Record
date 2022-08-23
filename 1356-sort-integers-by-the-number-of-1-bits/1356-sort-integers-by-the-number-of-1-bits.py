class Solution(object):
    def sortByBits(self, arr):
        """
        :type arr: List[int]
        :rtype: List[int]
        """
        
        ## return sorted(arr, key=lambda a: [bin(a).count('1'), a])
        
        return sorted(arr, key = lambda num : (sum((num >> i) & 1 for i in range(32)), num))