class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        match = {")" : "(", "]" : "[", "}" : "{"}
        
        for char in s:
            if char in match: ##closing
                top = stack.pop() if stack else '*' ##dummy
                if match[char] != top: return False
            else:
                stack.append(char)
                
        return not stack ##len(stack) == 0
        
        