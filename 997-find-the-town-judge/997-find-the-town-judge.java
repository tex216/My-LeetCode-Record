class Solution {
    public int findJudge(int n, int[][] trust) {
        if (trust.length < n-1) return -1;
        
        int[] score = new int[n+1];
        
        for (int[] group : trust) {
            score[group[0]]--;
            score[group[1]]++;
        }
        
        for (int i = 1; i <= n; i++) {
            if (score[i] == n-1) return i;
        }
        return -1;
    }
}