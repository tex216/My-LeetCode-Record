class Leaderboard {
    
    private HashMap<Integer, Integer> scores;

    public Leaderboard() {
        this.scores = new HashMap<Integer, Integer>();
    }
    
    public void addScore(int playerId, int score) {
        if (!this.scores.containsKey(playerId)) this.scores.put(playerId, 0);
        this.scores.put(playerId, this.scores.get(playerId) + score);
    }
    
    public int top(int K) {
        List<Integer> values = new ArrayList<Integer>(this.scores.values());
        Collections.sort(values, Collections.reverseOrder());
        
        int total = 0;
        for (int i = 0; i < K; i++) {
            total += values.get(i);
        }
        return total;
    }
    
    public void reset(int playerId) {
        this.scores.put(playerId, 0);
    }
}

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */