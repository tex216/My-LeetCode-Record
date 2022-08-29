class Solution(object):
    def calcEquation(self, equations, values, queries):
        """
        :type equations: List[List[str]]
        :type values: List[float]
        :type queries: List[List[str]]
        :rtype: List[float]
        """
        def build_graph(equations, values):
            graph = collections.defaultdict(list)
            for i in range(len(equations)):
                edge, weight = equations[i], values[i]
                start, end = edge
                graph[start].append((end, weight))
                graph[end].append((start, 1/weight))
            return graph
        
        def dfs(start, end, visited, graph, value):
            if start not in graph or end not in graph or start in visited: return -1;
            if start == end: return value;
            visited.append(start)
            for i in range(len(graph[start])):
                ans = dfs(graph[start][i][0], end, visited, graph, value * graph[start][i][1])
                if ans != -1: return ans
            return -1
        
        graph = build_graph(equations, values)
        return [dfs(start, end, [], graph, 1.0) for start, end in queries]
            