class OrderedStream {
    int pointer;
    String[] ans;

    public OrderedStream(int n) {
        pointer = 0;
        ans = new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> list = new ArrayList<>();
        ans[idKey-1] = value;
        while (pointer < ans.length && ans[pointer] != null) {
            list.add(ans[pointer]);
            pointer++;
        }
        return list;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */