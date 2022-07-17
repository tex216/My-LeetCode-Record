# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        return self.isMirror(root, root)
    
    def isMirror(self, x, y):
        if x is None and y is None: return True
        if x is None or y is None: return False
        return x.val == y.val and self.isMirror(x.left, y.right) and                                         self.isMirror(x.right, y.left)