class Solution {
    public int findJudge(int n, int[][] trust) {
        if (trust.length < n-1) return -1;
        
        int[] indegree = new int[n+1];
        int[] outdegree = new int[n+1];
        
        for (int[] group : trust) {
            outdegree[group[0]]++;
            indegree[group[1]]++;
        }
        
        for (int i = 1; i <= n; i++) {
            if (indegree[i] == n-1 && outdegree[i] == 0) return i;
        }
        
        return -1;
    }
}