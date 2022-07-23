class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        answer = ""
        for i in zip(*strs):
            if len(set(i)) == 1:
                answer += i[0]
            else:
                break
        return answer