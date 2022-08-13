class Solution(object):
    def findJudge(self, n, trust):
        """
        :type n: int
        :type trust: List[List[int]]
        :rtype: int
        """
        if len(trust) < n - 1: return -1
        
        indegree, outdegree = [0] * (n+1), [0] * (n+1)
        
        for a, b in trust:
            outdegree[a] += 1
            indegree[b] += 1
        
        for i in range(1, n + 1):
            if indegree[i] == n - 1 and outdegree[i] == 0:
                return i
        return -1