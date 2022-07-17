class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        current = maxSub = nums[0]
        for i in range(1, len(nums)):
            current = max(nums[i], nums[i]+current)
            maxSub = max(maxSub, current)
        return maxSub
            