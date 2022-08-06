# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isValidBST(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        return self.helper(root, float("-inf"), float("inf"))
    
    def helper(self, tree, minValue, maxValue):
        if tree is None: return True
        if tree.val <= minValue or tree.val >= maxValue: return False
        isLeftValid = self.helper(tree.left, minValue, tree.val)
        isRightValid = self.helper(tree.right, tree.val, maxValue)
        return isLeftValid and isRightValid
        