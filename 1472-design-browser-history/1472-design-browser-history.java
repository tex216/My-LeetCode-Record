class BrowserHistory {
    List<String> visits;
    int size;
    int curr;
    
    public BrowserHistory(String homepage) {
        visits = new ArrayList<>();
        visits.add(homepage);
        size = 1;
        curr = 0;
            
    }
    
    public void visit(String url) {
        if (curr + 1 < visits.size()) visits.set(curr+1, url);
        else visits.add(url);
        curr++;
        size = curr + 1;
    }
    
    public String back(int steps) {
        curr = Math.max(0, curr - steps);
        return visits.get(curr);
    }
    
    public String forward(int steps) {
        curr = Math.min(size - 1, curr + steps);
        return visits.get(curr);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */