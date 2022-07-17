class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> match = new HashMap(); 
        match.put(')', '(');
        match.put(']', '[');
        match.put('}', '{');
        Stack<Character> stack = new Stack();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (match.containsKey(c)) {
                if (stack.isEmpty()) {
                    return false;
                }
                else {
                    char top = stack.pop();
                    if (match.get(c) != top) {return false;}
                }
            }
            else {
                stack.push(c);
            }
        }
        
        return stack.isEmpty();
    }
}