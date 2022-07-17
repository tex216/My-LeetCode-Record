class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        dict = {}
        for i in range(len(nums)):
            match = target - nums[i]
            if match in dict:
                return [i, dict[match]]
            dict[nums[i]] = i
            
        return []
        