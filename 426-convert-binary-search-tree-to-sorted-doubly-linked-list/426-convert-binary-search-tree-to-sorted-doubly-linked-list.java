/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/

class Solution {
    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return root;
        }
        Node currNode = root;
        Node dummy = new Node(0);
        Node prev = dummy;
        Stack<Node> stack = new Stack();
        
        while (!stack.isEmpty() || currNode != null) {
            while (currNode != null) {
                stack.push(currNode);
                currNode = currNode.left;
            }
            currNode = stack.pop();
            prev.right = currNode;
            currNode.left = prev;
            prev = currNode;
            currNode = currNode.right;
        }
        dummy.right.left = prev;
        prev.right = dummy.right;
        return dummy.right;
    }
}