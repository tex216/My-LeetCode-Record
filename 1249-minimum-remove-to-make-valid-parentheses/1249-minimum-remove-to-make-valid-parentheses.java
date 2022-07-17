class Solution {
    public String minRemoveToMakeValid(String s) {
        Set<Integer> idxTrash = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            }
            if (s.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                else {idxTrash.add(i);}
            }
        }
        
        while (!stack.isEmpty()) {
            idxTrash.add(stack.pop());
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (!idxTrash.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
}