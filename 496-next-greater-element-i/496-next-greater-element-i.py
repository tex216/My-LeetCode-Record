class Solution(object):
    def nextGreaterElement(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        stack = []
        dict = {}
        
        for num in nums2:
            while stack and num > stack[-1]:
                dict[stack.pop()] = num
            stack.append(num)
        
        while stack:
            dict[stack.pop()] = -1
            
        ans = []
        for i in nums1:
            ans.append(dict[i])
        return ans
      