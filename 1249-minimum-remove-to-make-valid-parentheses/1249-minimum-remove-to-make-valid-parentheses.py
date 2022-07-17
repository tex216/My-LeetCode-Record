class Solution(object):
    def minRemoveToMakeValid(self, s):
        """
        :type s: str
        :rtype: str
        """
        stack = []
        idxTrash = set()
        ans = []
        
        for idx, char in enumerate(s):
            if char == '(':
                stack.append(idx)
            if char == ')':
                if stack:
                    stack.pop()
                else:
                    idxTrash.add(idx)
            
        while stack:
            idxTrash.add(stack.pop())
            
        for idx, char in enumerate(s):
            if idx not in idxTrash:
                ans.append(char)
        
        return ans