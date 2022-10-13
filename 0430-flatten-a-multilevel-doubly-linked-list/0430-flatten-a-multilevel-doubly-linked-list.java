/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
    
    //public Node(val, prev, next, child);
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;
        Node dummy = new Node(0, null, head, null);
        Node curr, prev = dummy;
        
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(head);
        
        while (!stack.isEmpty()) {
            curr = stack.pop();
            prev.next = curr;
            curr.prev = prev;
            
            if (curr.next != null) stack.push(curr.next);
            if (curr.child != null) {
                stack.push(curr.child);
                curr.child = null;
            }
            prev = curr;
        }
        
        dummy.next.prev = null;
        return dummy.next;
    }
}