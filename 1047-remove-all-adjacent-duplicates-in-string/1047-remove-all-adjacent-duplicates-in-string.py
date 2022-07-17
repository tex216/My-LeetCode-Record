class Solution(object):
    def removeDuplicates(self, s):
        """
        :type s: str
        :rtype: str
        """
        ans = []
        for char in s:
            if not ans or ans[-1] != char:
                ans.append(char)
            else:
                ans.pop()
        return "".join(ans)
        