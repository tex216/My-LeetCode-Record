class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        
        for (int i = s.length()-1; i >= 0; i--) {
            if (stack.isEmpty() ||stack.peek() != s.charAt(i)) {
                stack.push(s.charAt(i));
            }
            else {
                stack.pop();
            }
        }
        
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        return sb.toString();
    }
}