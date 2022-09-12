class Solution {
    int count = 0;
    public int countArrangement(int n) {
        boolean[] visited = new boolean[n+1];
        calculate(n, 1, visited);
        return count;
    }
    
    public void calculate(int n, int idx, boolean[] visited){
        if (idx > n) {
            count++;
            return;
        }
        
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && (idx % i == 0 || i % idx == 0)) {
                visited[i] = true;
                calculate(n, idx+1, visited);
                visited[i] = false;
            }
        }
        return;
    }
}