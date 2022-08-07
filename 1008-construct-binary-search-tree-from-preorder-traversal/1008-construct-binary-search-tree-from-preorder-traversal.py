# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def bstFromPreorder(self, preorder):
        """
        :type preorder: List[int]
        :rtype: TreeNode
        """
        global rootIdx
        rootIdx = 0
        return self.helper(preorder, -float("inf"), float("inf"))
    
    def helper(self, array, minValue, maxValue):
        global rootIdx
        if rootIdx >= len(array) or array[rootIdx] <= minValue \
            or array[rootIdx] >= maxValue: return None
            
        tree = TreeNode(array[rootIdx])
        rootIdx += 1
        tree.left = self.helper(array, minValue, tree.val)
        tree.right = self.helper(array, tree.val, maxValue)
        return tree