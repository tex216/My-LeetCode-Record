class Solution {
    public List<String> generateParenthesis(int n) {
        //Backtracking
        List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n);
        return list;
    }
    
    public void backtrack(List<String> list, String str, int open, int close, int n) {
        if (str.length() == 2 * n) {
            list.add(str);
            return;
        }
        
        //open = 0
        if (open < n) backtrack(list, str+"(", open+1, close, n);
        //close = 0
        if (close < open) backtrack(list, str+")", open, close+1, n);
    }
}