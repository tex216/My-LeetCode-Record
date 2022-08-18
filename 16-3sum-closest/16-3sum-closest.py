class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums.sort()
        sum = nums[0] + nums[1] + nums[2]
        for i in range(len(nums) - 2):
            left, right = i + 1, len(nums) - 1
            while left < right:
                currSum = nums[i] + nums[left] + nums[right]
                if abs(currSum - target) < abs(sum - target):
                    sum = currSum
                if currSum < target: left += 1
                elif currSum > target: right -= 1
                else: return sum
        return sum