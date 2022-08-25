class Solution {
    
    class Pair {
        char c;
        int count;
        public Pair(char c, int count) {
            this.c = c;
            this.count = count;
        }
    }
    
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (stack.isEmpty() || stack.peek().c != s.charAt(i)) {
                stack.push(new Pair(s.charAt(i), 1));
            }
            else {
                stack.peek().count++;
            }
            if (stack.peek().count == k) stack.pop();
        }
        
        while (!stack.isEmpty()) {
            Pair p = stack.pop();
            for (int i = 0; i < p.count; i++) {
                sb.append(p.c);
            }
        }
        
        return sb.toString();
    }
}