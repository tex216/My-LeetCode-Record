# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def closestValue(self, root, target):
        """
        :type root: TreeNode
        :type target: float
        :rtype: int
        """
        currNode, closest = root, root.val
        while (currNode is not None):
            if abs(currNode.val-target) < abs(closest-target):
                closest = currNode.val
            if currNode.val < target:
                currNode = currNode.right
            elif currNode.val > target:
                currNode = currNode.left
            else:
                break
        return closest
        