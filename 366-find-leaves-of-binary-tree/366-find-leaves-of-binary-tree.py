# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def findLeaves(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        if not root: return []
        ans = []
        
        def findLevel(node):
            level = 0
            if node.left:
                level = max(level, 1+findLevel(node.left))
            if node.right:
                level = max(level, 1+findLevel(node.right))
                
            if level <len(ans):
                ans[level].append(node.val)
            else:
                ans.append([node.val])
            
            return level
        
        findLevel(root)
        return ans