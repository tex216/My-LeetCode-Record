# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def sortedArrayToBST(self, nums):
        """
        :type nums: List[int]
        :rtype: TreeNode
        """
        return self.constructBST(nums, 0, len(nums)-1)
    
    def constructBST(self, nums, start, end):
        if end < start: return None
        middle = (start + end) // 2
        root = TreeNode(nums[middle])
        root.left = self.constructBST(nums, start, middle -1)
        root.right = self.constructBST(nums, middle + 1, end)
        return root
        